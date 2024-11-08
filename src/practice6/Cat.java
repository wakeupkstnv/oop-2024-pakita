package practice6;

import java.util.Objects;

public class Cat extends Animal implements CanHavePizza, Client{
    private String breed;

    public Cat(String name, int age) {
        super(name, age);
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void eat() {
        System.out.println("nyam-nyam meow");
    }

    @Override
    void sound() {
        System.out.println("meow-meow");
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(breed, cat.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), breed);
    }

    @Override
    public String toString() {
        return "Cat[" +
                "breed='" + breed + '\'' +
                ']';
    }
}
