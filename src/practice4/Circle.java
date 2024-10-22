package practice4;

public class Circle extends Shape {
    private int radius;

    public Circle(){
        super();
    }

    public Circle(Color color, int pos, int radius){
        super(color, pos);
        this.radius = radius;
    }


    @Override
    public void draw() {
        super.draw();
        if (getColor() == Color.BLACK){
            System.out.print("Bc\n");
        }
        else{
            System.err.println("Rc\n");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "[Circle[" +
                "radius=" + radius +
                ']';
    }
}
