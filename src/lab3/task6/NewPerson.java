package lab3.task6;

import lab2.task5.person.Person;

import java.io.Serializable;

public class NewPerson extends Person implements Comparable<Person>, Serializable, CanSleep, Movable{
    @Override
    public int compareTo(Person o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public String getOccupation() {
        return null;
    }

    @Override
    public void sleep() {
        System.out.println("sleep z-z-z xD");
    }

    @Override
    public void move() {
        System.out.println("top-top-top hell nahh...");
    }
}
