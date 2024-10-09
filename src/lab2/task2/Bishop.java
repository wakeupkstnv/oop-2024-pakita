package lab2.task2;

public class Bishop extends Piece {

    public Bishop(Position thisPosition) {
        super(thisPosition);
    }

    public static boolean isLegalMove(Position thisPosition, Position nextPosition) {
        int xDiff = Math.abs(nextPosition.positionX - thisPosition.positionX);
        int yDiff = Math.abs(nextPosition.positionY - thisPosition.positionY);
        return isInBoard(nextPosition) && (xDiff == yDiff);
    }

    @Override
    public boolean isLegalMove(Position nextPosition) {
        return isLegalMove(this.thisPosition, nextPosition);
    }
}
