package lab2.task2;

public class Rook extends Piece {
    public Rook(Position thisPosition) {
        super(thisPosition);
    }


    public static boolean isLegalMove(Position thisPosition, Position nextPosition) {
        return isInBoard(nextPosition) &&
                ((thisPosition.positionX == nextPosition.positionX && thisPosition.positionY != nextPosition.positionY)
                || (thisPosition.positionX != nextPosition.positionX && thisPosition.positionY == nextPosition.positionY));
    }

    public boolean isLegalMove(Position nextPosition) {
        return isLegalMove(this.thisPosition, nextPosition) && !isInOnOnePosition(nextPosition);
    }

}