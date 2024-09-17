package practice1;

import java.util.Scanner;

public class Task6 {
    public static boolean isPalindrome(String word){
        for (int i = 0; i < word.length(); i++){
            if (i == word.length() - 1 - i) break;
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();

        if (isPalindrome(word)) System.out.println("yes");
        else System.out.println("no");
    }
}
