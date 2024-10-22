package lab2.task3;

import java.util.Objects;

public abstract class Account{
    private String firstName, lastName;
    private double balance; // The current balance
    private final int accNumber; // The account number
    private boolean isOpen;

    {
        this.isOpen = true;
    }

    public Account(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = 0.0;
        this.accNumber = hashCode(); //TODO: dont forget
    }

    public void deposit(double sum) {
        if(!getIsOpen()) return;
        this.balance += sum;
    }
    public void withdraw(double sum) {
        if (!getIsOpen()) return;
        if (this.balance - sum < 0){
            System.out.println("Error");
            return;
        }
        this.balance -= sum;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
    public boolean getIsOpen(){
        return this.isOpen;
    }
    public double getBalance() { return this.balance; }
    public double getAccountNumber() { return this.accNumber; }
    public void transfer(double amount, Account other) {
        if (!getIsOpen() || !other.getIsOpen()) return;
        if (getBalance() < amount) return;
        if (this instanceof CheckingAccount) {
            CheckingAccount s = (CheckingAccount) other;
            if (s.getTransactionCount() > CheckingAccount.FREE_TRANSACTION) {
                if (s.getBalance() < amount + 0.2) return;
            }
        }
        this.withdraw(amount);
        other.deposit(amount);
        System.out.println("nice!");
    }

    public final void print() {
        System.out.println(toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return this.getAccountNumber() == account.getAccountNumber();
    }

    public boolean equals(int accNumber) {
        return this.getAccountNumber() == accNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName) % 10;
    }

    @Override
    public String toString() {
        return "Account[" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", balance=" + balance +
                ", accNumber=" + accNumber +
                ", isOpen=" + isOpen +
                ']';
    }

}