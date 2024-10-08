package lab2.task1.shapes;

public class Cube {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public String toString() {
        return super.toString() + "[" + "Cube[" +
                "side=" + side +
                "]]";
    }
}
