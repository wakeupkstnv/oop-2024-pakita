package practice3.problem1;

public class CatTest {
    public static void main(String[] args) {
        Cat c1 = new Cat(2, "Barsik", Gender.MALE);
        System.out.println(c1);

        c1.addSpeed(100);
        System.out.println(c1.getSpeed());

        c1.addSpeed(100, 10);
        System.out.println(c1.getSpeed());

        System.out.println(c1.move());
    }
}
