package basic_core_program;

import java.util.Scanner;

public class BasicMain {
    public static void main(String args[]) {
        BasicProgram cp = new BasicProgram();
        System.out.println("1.Leap Year \n2.Quotient and Reminder \n3.Swap Number \n4.Even odd number \n5.Vowels and Consonant \n6. Largest Among Three Numbers\n7.Harmonic Number");
        System.out.println("Enter number to check program : ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        switch (a) {
            case 1:
                cp.leapYear();
                break;
            case 2:
                cp.evenOddNumber();
                break;
            case 3:
                cp.quotientReminder();
                break;
            case 4:
                cp.largestOfThree();
                break;
            case 5:
                cp.vowles();
                break;
            case 6:
                cp.swapNumber();
                break;
            case 7:
                cp.harmonic();
                break;
            case 8:
                cp.primeFactor();
                break;
            case 9:
                cp.powerOfTwo();
                break;
        }
    }

}
