package dz;

import java.util.Scanner;

public class Methods {

    public static long checkingCorrectNum(long num) {
            if (num < 5 || num > 20) {
                Scanner scan = new Scanner(System.in);
                System.out.print("Type correct number! ");
                System.out.print("Type a number (from 5 to 20): ");
                num = scan.nextInt();
                return checkingCorrectNum(num);
            }

            return num;
    }

    public static long findingFactorial(long num, long counter, long factorial) {
        factorial = factorial > 1 ? factorial * counter : 2;
        if (counter == num) {
            return factorial;
        }
        return findingFactorial(num, ++counter, factorial);
    }
}
