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

    void sumOfThreeIntegers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element:");
        int numberOfElement = sc.nextInt();
        int numberOfElements = 0;
        int arraySize[] = new int[numberOfElements];
        int i, j, k;
        for (i = 0; i < numberOfElement; i++) {
            arraySize[i] = sc.nextInt();
        }
        for (i = 0; i < numberOfElement - 2; i++)
            for (j = i + 1; j < numberOfElement - 1; j++)
                for (k = j + 1; k < numberOfElement; k++) {
                    if (arraySize[i] + arraySize[j] + arraySize[k] == 0)
                        System.out.println("Elements are " + arraySize[i] + "," + arraySize[j] + "," + arraySize[k]);
                }
        }
}
