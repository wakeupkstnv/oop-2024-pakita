package lab2.task3;

import lab2.task2.Pawn;

import java.util.Vector;

public class Bank {
    static private Vector<Account> accounts = new Vector<Account>();

    private Bank(){}

    static void addNewUser(Account account){
        accounts.add(account);
    }

    static Vector<Account> getAccounts() {
        return accounts;
    }

    static void update(){
        for (Account cur: Bank.getAccounts()){
            if (cur instanceof CheckingAccount checkingAccount){
                checkingAccount.deductFee();
            } else if (cur instanceof SavingAccount savingAccount) {
                savingAccount.addInterest();
            }
        }
    }

    private static void closeOrOpen(Account account, boolean move){
        for (int i = 0; i < Bank.accounts.size(); i++) {
            if (Bank.accounts.get(i).equals(account)) {
                Bank.accounts.get(i).setOpen(move);
                System.out.println("Account with number " + account.getAccountNumber() + " is now closed.");
                System.out.println("Account index: " + i);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    private static void closeOrOpen(int accNumber, boolean move){
        for (int i = 0; i < Bank.accounts.size(); i++) {
            Account account = Bank.accounts.get(i);
            if (account.getAccountNumber() == accNumber) {
                account.setOpen(false);
                System.out.println("Account with number " + accNumber + " is now closed.");
                System.out.println("Account index: " + i);
                return;
            }
        }
        System.out.println("Account with number " + accNumber + " not found.");
    }

    static void closeAccount(Account account) {
        closeOrOpen(account, false);
    }


    static void closeAccount(int accNumber) {
        closeOrOpen(accNumber, false);
    }

    static void openAccount(Account account){
        closeOrOpen(account, true);
    }

    static void openAccount(int accNumber){
        closeOrOpen(accNumber, true);
    }

    static void print(){
        System.out.println(getAccounts());
    }

}
