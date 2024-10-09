package lab2.task2;

public class Position {
    public char positionX;
    public int positionY;

    public Position(char positionX, int positionY){
        if (positionX >= 'a' && positionX <= 'h'
                && positionY >= 1 && positionY <= 8){
            this.positionX = positionX;
            this.positionY = positionY;
        } else {
            this.positionX = 'x';
            this.positionY = -1;
        }
    }

}
