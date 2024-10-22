package practice4;

public class Triangle extends Shape{
    private boolean isIsoceles;

    public Triangle(){
        super();
        isIsoceles = false;
    }

    public Triangle(Color color, int pos, boolean isIsoceles){
        super(color, pos);
        this.isIsoceles = isIsoceles;
    }

    @Override
    public void draw() {
        super.draw();
        if (getColor() == Color.BLACK){
            System.out.print("Bt\n");
        }
        else{
            System.err.println("Rt\n");
        }
    }


}
