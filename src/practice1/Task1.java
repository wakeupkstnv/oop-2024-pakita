package practice1;

import java.util.Scanner;

public class Task1 {
    final static String PLUS = "+", LINE = "-";
    private static void printName(String name){
        String borderLines = LINE.repeat(name.length());
        String border = String.format("%s%s%s", PLUS, borderLines, PLUS);
        System.out.printf("%s%n|%s|%n%s", border, name, border);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        in.close();

        printName(name);
    }
}
