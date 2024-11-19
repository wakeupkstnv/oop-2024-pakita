package lab3.task2;

public class Position {
    public int x, y;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void changeCoordinate(int x, int y){
        this.x += x;
        this.y += y;
    }

    @Override
    public String toString() {
        return "Position[" +
                "x=" + x +
                ", y=" + y +
                ']';
    }
}
