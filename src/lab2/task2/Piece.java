package lab2.task2;

public abstract class Piece {
    Position thisPosition;

    public Piece(Position thisPosition){
        this.thisPosition = thisPosition;
    }

    public static boolean isLegalMove(Position thisPosition, Position nextPosition){
        return false;
    };

    public abstract boolean isLegalMove(Position nextPosition);

    public static boolean isInBoard(Position position){
        return position.positionX >= 'a' && position.positionX <= 'h'
                && position.positionY >= 1 && position.positionY <= 8;
    }
}
