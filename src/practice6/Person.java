package practice6;

import java.util.Objects;

public class Person implements Eat, CanHavePizza, Client{
    private String name;
    private int age;
    private int billing;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        this.billing = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setBilling(int billing) {
        this.billing = billing;
    }

    public int getBilling() {
        return billing;
    }

    public void addMoney(int money){
        setBilling(getBilling() + money);
    }

    @Override
    public void eat() {
        System.out.println("Om-nom nom");
    }

    public void takeMoney(int money){
        if (getBilling() >= money) setBilling(getBilling() - money);
        else System.out.println("Malo babok lol");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Person person = (Person) obj;
        return this.getName() == person.getName() && this.getAge() == person.getAge();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person[" +
                "name='" + name + '\'' +
                ", age=" + age +
                ']';
    }
}
