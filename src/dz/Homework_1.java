package dz;

import java.util.Scanner;

public class Homework_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Type a number (from 5 to 20): ");
        long num = scan.nextInt();

        System.out.println("Factorial of " + num + " is " + Methods.findingFactorial(Methods.checkingCorrectNum(num), 2, 1));
    }
}
