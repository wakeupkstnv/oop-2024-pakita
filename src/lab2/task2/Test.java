package lab2.task2;

public class Test {
    public static void main(String[] args) {
        King king = new King(new Position('e', 1));
        System.out.println(king.isLegalMove(new Position('e', 2)));

        Rook rook = new Rook(new Position('e', 1));
        System.out.println(rook.isLegalMove(new Position('e', 8)));

        Bishop bishop = new Bishop(new Position('f', 1));
        System.out.println(bishop.isLegalMove(new Position('a', 6)));

        Queen queen = new Queen(new Position('d', 1));
        System.out.println(queen.isLegalMove(new Position('b', 3)));

        Knight knight = new Knight(new Position('g', 1));
        System.out.println(knight.isLegalMove(new Position('e', 2)));

        Pawn pawn = new Pawn(new Position('e', 2));
        pawn.isLegalMove(new Position('e', 4));
    }
}
