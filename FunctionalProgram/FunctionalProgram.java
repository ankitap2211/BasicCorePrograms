package basic_core_program.FunctionalProgram;

import java.util.Scanner;

public class FunctionalProgram {
    void quadratic() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for a :");
        double a = sc.nextDouble();
        System.out.print("Enter value for b :");
        double b = sc.nextDouble();
        System.out.print("Enter value for c :");
        double c = sc.nextDouble();
        double x = b * b - 4 * a * c;

        if (x > 0) {
            double root1 = (-b + Math.sqrt(x)) / (2 * a);
            double root2 = (-b - Math.sqrt(x)) / (2 * a);
            System.out.println("Roots are " + root1 + " " + root2);
        } else if (x == 0) {
            double x1 = -b / 2 * a;
            System.out.println("The roots is :" + x1);
        }
    }

    void distance() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter point for x axis : ");
        double x = sc.nextDouble();
        System.out.print("Enter point for y axis : ");
        double y = sc.nextDouble();
        double distance = Math.sqrt(x * x + y * y);
        System.out.println("distance from (" + x + "," + y + ") to (0,0) = " + distance);
    }

}
