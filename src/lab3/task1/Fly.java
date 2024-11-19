package lab3.task1;

public class Fly extends Animal implements Cloneable{
    private int countOfWings;
    public Fly(int age, String name, int countOfWings) {
        super(age, name);
        this.countOfWings = countOfWings;
    }

    public void setCountOfWings(int countOfWings) {
        this.countOfWings = countOfWings;
    }

    public int getCountOfWings() {
        return countOfWings;
    }
    @Override
    void sound() {
        System.out.println("b-z-z-z-z-z");
    }

    @Override
    public Fly clone() {
        try {
            return (Fly) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        return super.equals(o);
    }

    @Override
    public String toString() {
        return super.toString() + "[Fly]";
    }
}
