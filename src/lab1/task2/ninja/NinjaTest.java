package lab1.task2.ninja;

import lab1.task2.Rank;
import lab1.task2.Village;

public class NinjaTest {
    public static void main(String[] args) {
        Ninja n1 = new Ninja("Naruto", Village.KONOHAGAKURE, Rank.KAGE, 10000);
        Ninja n2 = new Ninja("Sasuke", Village.KONOHAGAKURE, Rank.CHUNIN, 1000);
        System.out.println(Ninja.fight(n1, n2));

    }
}
