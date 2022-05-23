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

    void evenOddNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check odd or even :");
        int x = sc.nextInt();
        if (x % 2 == 0)
            System.out.println(x + " is Even number");
        else
            System.out.println(x + " is Odd number");
    }

    void vowles() {
        char c;
        Scanner Scanner;
        Scanner = new Scanner(System.in);
        System.out.println("Enter any letter to check vowels or consonant:");
        c = Scanner.next().charAt(0);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            System.out.println(c + " Alphabet is vowel");
        else
            System.out.println(c + " Alphabet is consonant");
    }

    void largestOfThree() {
        System.out.println("Enter three number to find largest one :");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x > y && x > z)
            System.out.println(x + " is large");
        else if (y > x && y > z)
            System.out.println(y + " is large");
        else
            System.out.println(z + " is large");
    }

}
