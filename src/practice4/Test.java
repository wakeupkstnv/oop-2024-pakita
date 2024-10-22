package practice4;

import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle(Color.RED, 2, 2);
        Triangle t1 = new Triangle(Color.BLACK, 7, false);
        Circle c2 = new Circle(Color.RED, 3, 2);
        Triangle t2 = new Triangle(Color.BLACK, 6, false);
        Circle c3 = new Circle(Color.RED, 2, 2);
        Triangle t3 = new Triangle(Color.BLACK, 5, false);
        Vector<Shape> shapes = new Vector<>();
        shapes.add(c1);
        shapes.add(c2);
        shapes.add(c3);
        shapes.add(t1);
        shapes.add(t2);
        shapes.add(t3);
        for (Shape s: shapes){
            s.draw();
        }
    }
}
