package lab2.task2;

public class Pawn extends Piece{
    private int movesCount;

    {
        movesCount = 0;
    }

    public Pawn(Position thisPosition) {
        super(thisPosition);
    }

    public static boolean isLegalMove(Position thisPosition, Position nextPosition) {
        int diffY = nextPosition.positionY - thisPosition.positionY;
        return (diffY == 1 || diffY == 2);
    }

    @Override
    public boolean isLegalMove(Position nextPosition) {
        int diffY = nextPosition.positionY - thisPosition.positionY;
        if (movesCount == 0){
            return isLegalMove(this.thisPosition, nextPosition);
        } else{
            return (diffY == 1);
        }
    }
}
