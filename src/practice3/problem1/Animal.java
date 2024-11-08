package practice3.problem1;

import java.util.Objects;

public abstract class Animal {
    int age;
    String name;
    Gender gender;
    boolean isHappy;
    boolean isHungry;
    int speed;
    public Animal(){
        this.isHappy = true;
        this.speed = 0;
        this.isHungry = false;
    }

    public Animal(int age, String name, Gender gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public abstract String move();

    public void addSpeed(int amountOfFeed){
        this.speed += amountOfFeed >= 3 ? 10 : 1;
    };

    public void addSpeed(double amountOfFeed) {
        this.speed += amountOfFeed >= 3.0 ? 10 : 1;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", isHappy=" + isHappy +
                ", isHungry=" + isHungry +
                ", speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && isHappy == animal.isHappy && isHungry == animal.isHungry && speed == animal.speed && Objects.equals(name, animal.name) && gender == animal.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, gender, isHappy, isHungry, speed);
    }
}