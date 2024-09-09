package LAB_1;

import java.util.Scanner;

public class Task3 {
    final static String[] Grading = {"F", "F", "F", "F", "F", "F", "F", "F", "F", "F","D", "C-", "C", "C+", "B-", "B", "B+", "A-", "A"};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int points = in.nextInt();
        in.close();

        int index = (int) points / 5;

        System.out.println(Grading[index - 1]);
    }
}