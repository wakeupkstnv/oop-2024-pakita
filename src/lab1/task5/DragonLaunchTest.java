package lab1.task5;

public class DragonLaunchTest {
    public static void main(String[] args) {
        Person b = new Person(Gender.B);
        Person g = new Person(Gender.G);

        DragonLaunch.kidnap(b);
        DragonLaunch.kidnap(b);
        DragonLaunch.kidnap(g);
        DragonLaunch.kidnap(g);

        System.out.println(DragonLaunch.willDragonEatOrNot() ? "Yes": "No");
    }
}
