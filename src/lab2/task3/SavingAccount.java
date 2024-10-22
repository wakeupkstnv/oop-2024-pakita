package lab2.task3;

public class SavingAccount extends Account {
    final double interestRate; //maybe it is a const IDK

    {
        Bank.addNewUser(this);
    }

    public SavingAccount(String firstName, String lastName, double interestRate) {
        super(firstName, lastName);
        this.interestRate = interestRate;
    }

    public void addInterest(){
        this.deposit(this.getBalance() * (interestRate / 10));
    }

    @Override
    public String toString() {
        return super.toString() +
                "[SavingAccount INTEREST_RATE=" +
                this.interestRate +
                "]";
    }
}
