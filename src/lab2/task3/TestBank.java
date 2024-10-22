package lab2.task3;

public class TestBank {
    public static void main(String[] args) {
        CheckingAccount ch = new CheckingAccount("Tamirlan", "Kustanayev");
//        CheckingAccount ch2 = new CheckingAccount("Daryn", "Kenes");
        SavingAccount sv = new SavingAccount("Bekzat", "Temirbolat", 5);
//        SavingAccount sv2 = new SavingAccount("Assanali", "Ushtayev", 10);
        Bank.addNewUser(ch);
        Bank.addNewUser(sv);
        ch.deposit(1);
        ch.deposit(1);
        ch.deposit(1);
        ch.deposit(1);
        ch.deposit(1);
        ch.withdraw(4);
        sv.deposit(100);
        Bank.update();

//        System.out.println(Bank);


    }
}

