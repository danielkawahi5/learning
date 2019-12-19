package fun;

import java.io.IOException;
import java.util.Scanner;

public class PrimeNumbers {

    private static Scanner scanner = new Scanner(System.in);

    public void primeNumber() {
        System.out.println("Enter the first number: ");
        int start = scanner.nextInt();
        System.out.println("Enter second number: ");
        int end = scanner.nextInt();
        if (end < start) {
            System.out.println("Second number must be greater than first number!");
        } else {
            return;
        }
        System.out.println("List of PRIME NUMBERS between " + start + " & " + end);
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
