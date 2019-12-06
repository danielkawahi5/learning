package masterclass.java.S05.excercises;

import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
                scanner.nextLine();
            } else {
                break;
            }
        }
        if (count == 0) {
            count = 1;
        }
        long avg = Math.round((double) sum / count);
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }

}
