package practice6;

import java.util.Objects;

public class Dog extends Animal implements Eat{
    private String breed;

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("hum-hum");
    }

    @Override
    void sound() {
        System.out.println("gav-gav haha");
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), breed);
    }

    @Override
    public String toString() {
        return "Dog[" +
                "breed='" + breed + '\'' +
                ']';
    }
}
