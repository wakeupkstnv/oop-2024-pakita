package LAB_1;

import java.util.Scanner;


public class Task5 {
    private static double addPercent(int balance, int percent) {
        return balance * (1 + percent / 100.0);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int balance = in.nextInt();
        int percent = in.nextInt();
        in.close();

        System.out.println(addPercent(balance, percent));
    }
}
