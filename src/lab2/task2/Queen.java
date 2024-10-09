package lab2.task2;

public class Queen extends Piece{

    public Queen(Position thisPosition) {
        super(thisPosition);
    }

    public static boolean isLegalMove(Position thisPosition, Position nextPosition){
        return Rook.isLegalMove(thisPosition, nextPosition) || Bishop.isLegalMove(thisPosition, nextPosition);
    }
    @Override
    public boolean isLegalMove(Position nextPosition) {
        return isLegalMove(this.thisPosition, nextPosition);
    }
}
