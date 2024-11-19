package lab3.task2;

import lab3.task1.Transport;

public class Car extends Transport implements Cloneable, Gas{
    public Car(String model, String name, int avarageSpeed) {
        super(model, name, avarageSpeed);
    }

    @Override
    public void move() {
        position.changeCoordinate(getAvarageSpeed(), 0);
    }

    @Override
    public int getPosition() {
        return position.getX();
    }

    @Override
    public Car clone() {
        try {
            return (Car) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
