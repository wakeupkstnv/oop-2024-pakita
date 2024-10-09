package lab2.task2;

public class Knight extends Piece{
    public Knight(Position thisPosition) {
        super(thisPosition);
    }

    @Override
    public boolean isLegalMove(Position nextPosition) {
        return false;
    }
}
