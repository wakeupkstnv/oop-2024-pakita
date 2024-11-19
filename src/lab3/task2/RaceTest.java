package lab3.task2;

public class RaceTest {
    public static void main(String[] args) {
        Person p = new Person("Tamirlan", 19);
        Swimmer s = new Swimmer("Bekzat", 18, true);
        Car c = new Car("Audi", "TT", 10);

        Race.addRacer(p);
        Race.addRacer(s);
        Race.addRacer(c);

        Race.racing();
        Race.racing();
    }
}
