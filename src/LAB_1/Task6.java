package LAB_1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();

        for (int i = 0; i < word.length(); i++){
            if (i == word.length() - 1 - i) break;
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)){
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}
