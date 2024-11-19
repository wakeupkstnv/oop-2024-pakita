package lab3.task1;

import lab3.task2.Position;

public class Airplane extends Transport implements Cloneable, Flyable{


    public Airplane(String model, String name, int avarageSpeed) {
        super(model, name, avarageSpeed);
    }

    @Override
    public void fly() {
        System.out.println("weoooww");
    }

    @Override
    public Airplane clone() {
        try {
            return (Airplane) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public void move() {
        System.out.println("feeeeeeeew");
    }

    @Override
    public int getPosition() {
        return position.getX();
    }
}
