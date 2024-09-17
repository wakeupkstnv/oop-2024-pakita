package practice2.time;

public class TimeTest {
    public static void main(String[] args) {
        Time newTime = new Time(1, 25, 35);
        System.out.println(newTime.toUniversal());
        System.out.println(newTime.toStandart());

        Time secondTime = new Time(2, 5, 17);
        newTime.add(secondTime);
    }

}
