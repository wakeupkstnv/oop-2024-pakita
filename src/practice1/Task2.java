package practice1;

import java.util.Scanner;

public class Task2 {
    protected static double findPerimeter(double side){
        return side * 4;
    }

    protected static double findArea(double side){
        return side * side;
    }

    private static double findDiagonal(double side){
        return Math.sqrt(2 * Math.pow(side, 2));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.close();

        double side = in.nextDouble();
        double perimeter = findPerimeter(side);
        double area = findArea(side);
        double diagonal = findDiagonal(side);

        System.out.printf("Perimeter: %.1f%nArea: %.1f%nDiagonal: %.1f%n", perimeter, area, diagonal);
    }
}
