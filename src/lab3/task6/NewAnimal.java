package lab3.task6;

import lab2.task5.animal.Animal;

import java.io.Serializable;

public class NewAnimal extends Animal implements Comparable<Animal>, Serializable, CanSleep, Movable{
    @Override
    public void getSound() {}

    @Override
    public int compareTo(Animal o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public void sleep() {
        System.out.println("Sleep z-z-z-z");
    }

    @Override
    public void move() {
        System.out.println("Top-top-top");
    }
}
