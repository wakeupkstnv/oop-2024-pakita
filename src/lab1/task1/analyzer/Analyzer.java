package lab1.task1.analyzer;
import lab1.task1.data.Data;

import java.util.Scanner;

public class Analyzer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userInput = "";

        Data d1 = new Data();

        while (true) {
            userInput = in.next();
            if (userInput.equals("Q")
            ) break;
            d1.add(Integer.parseInt(userInput));
        }

        System.out.println(d1.toString());


    }
}
