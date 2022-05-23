package basic_core_program;

import java.util.Scanner;

public class BasicProgram {
    void leapYear() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter four digit year to check leap year or not ");
        int year = sc.nextInt();
        if (year % 4 == 0)
            System.out.println(year + " is leap year");
        else
            System.out.println(year + " is not leap year");
    }

    void quotientReminder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dividend :");
        int dividend = sc.nextInt();
        System.out.println("Enter divisor :");
        int divisor = sc.nextInt();
        int quotient = dividend / divisor;
        int reminder = dividend % divisor;
        System.out.println("Quotient is: " + quotient);
        System.out.println("Reminder is :" + reminder);
    }

    void swapNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number to swap :");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Before swapping numbers are :" + x + " " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping numbers are :" + x + " " + y);
    }

}
