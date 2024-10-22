package lab2.task2;

public class Knight extends Piece{
    public Knight(Position thisPosition) {
        super(thisPosition);
    }

    public static boolean isLegalMove(Position thisPosition, Position nextPosition) {
        int xDiff = Math.abs(nextPosition.positionX - thisPosition.positionX);
        int yDiff = Math.abs(nextPosition.positionY - thisPosition.positionY);

        return ((xDiff == 2 && yDiff == 1) || (xDiff == 1 && yDiff == 2)) && isInBoard(nextPosition);
    }

    @Override
    public boolean isLegalMove(Position nextPosition) {
        return isLegalMove(this.thisPosition, nextPosition) && !isInOnOnePosition(thisPosition);
    }
}
