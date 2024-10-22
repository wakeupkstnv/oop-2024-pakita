package lab2.task2;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return positionX == position.positionX && positionY == position.positionY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(positionX, positionY);
    }
}
