package lab2.task3;

import java.util.Vector;
public class CheckingAccount extends Account {
    final static int FREE_TRANSACTION = 5;
    private int transactionCount;
    final static double COMMISSION = 0.02;

    public CheckingAccount(String firstName, String lastName) {
        super(firstName, lastName);
        this.transactionCount = 0;
    }

    public void deductFee() {
        if (transactionCount > FREE_TRANSACTION) {
            double fee = COMMISSION;
            if (getBalance() >= fee) {
                super.withdraw(fee);
            } else {
                System.out.println("Error");
            }
        }
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        transactionCount++;
        deductFee();
    }

    @Override
    public void withdraw(double sum) {
        if (sum > getBalance()) {
            System.out.println("Insufficient funds.");
            return;
        }
        super.withdraw(sum);
        transactionCount++;
        deductFee();
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    @Override
    public String toString() {
        return super.toString() + "[CheckingAccount[transactionCount=" + transactionCount + "]]";
    }
}
