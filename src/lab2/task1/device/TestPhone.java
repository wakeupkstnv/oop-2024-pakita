package lab2.task1.device;

public class TestPhone {
    public static void main(String[] args) {
        Phone phone = new Phone("Iphone", "14 Plus", true, 100, 10, 50, 100);
        Phone phone2 = new Phone("Iphone", "14 Plus", true, 100, 10, 50, 100);

        System.out.println(phone.equals(phone2));
        System.out.println(phone.hashCode());

        for (int i = 0; i < 4; i++){
            phone.use();
        }

    }
}
