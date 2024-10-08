package lab2.task1.shapes;

public class Sphere extends Shape3D {
    private double radius;

    public Sphere(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double volume() {
        return (4 / 3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return super.toString() + "[Sphere[" +
                "radius=" + radius +
                "]]";
    }
}
