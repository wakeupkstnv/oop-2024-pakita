package lab2.task2;

public class King extends Piece {
    public King(Position thisPosition) {
        super(thisPosition);
    }

    public static boolean isLegalMove(Position thisPosition, Position nextPosition) {
        int xDiff = Math.abs(nextPosition.positionX - thisPosition.positionX);
        int yDiff = Math.abs(nextPosition.positionY - thisPosition.positionY);
        return  isInBoard(nextPosition) && (xDiff <= 1 && yDiff <= 1) && (xDiff + yDiff > 0);
    }

    @Override
    public boolean isLegalMove(Position nextPosition) {
        return isLegalMove(this.thisPosition, nextPosition);
    }
}
