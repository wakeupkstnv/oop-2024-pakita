package LAB_1;

import java.util.Scanner;

public class Task4 {

    private static double findDiscriminant(int a, int b, int c) {
        return Math.pow(b, 2) - 4 * a * c;
    }
    private static double[] solveQuadraticEquation(int a, int b, int c) {
        double discriminant = findDiscriminant(a, b, c);

        if (discriminant < 0) {
            return new double[] {};
        } else if (discriminant == 0) {
            return new double[] {
                    -b / (2.0 * a)
            };
        } else {
            return new double[] {
                    (-b + Math.sqrt(discriminant)) / (2.0 * a),
                    (-b - Math.sqrt(discriminant)) / (2.0 * a)
            };
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();;
        double[] answer = solveQuadraticEquation(a, b, c);
        in.close();

        if (answer.length == 0) {
            System.out.println("Error");
        } else {
            for (double root : answer) {
                System.out.println(root);
            }
        }
    }
}
