package practice6;

public class Test {
    public static void main(String[] args) {
        Cat c1 = new Cat("Barsik", 5);
        Cat c2 = new Cat("Murka", 6);
        Student s1 = new Student("Tamir", 19, 3.1);
        Student s2 = new Student("Daryn", 18, 2.95);
        Dog d1 = new Dog("Bobik", 7);
        Dodo.addClient(c1);
        Dodo.addClient(c2);
        Dodo.addClient(s1);
        Dodo.addClient(s2);
        Dodo.addClient(d1);
        Dodo.pizzaParty();
    }
}
