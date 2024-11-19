package lab3.task2;

public class Swimmer extends Person implements Swimmable, Cloneable{
    public boolean isHaveMedal;
    public Position position;

    public Swimmer(String name, int age, boolean isHaveMedal) {
        super(name, age);
        this.isHaveMedal = isHaveMedal;
        position = new Position(0, 0);
    }

    @Override
    public void move() {
        position.changeCoordinate(1, 0);
    }
    @Override
    public Swimmer clone() {
        try {
            return (Swimmer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Swimmer[" +
                "isHaveMedal=" + isHaveMedal +
                ']';
    }

}
