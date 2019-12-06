package timbuchalka.java.S08.arrays;

import java.util.Scanner;

public class Arrays {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("element " + i + ", typed value was " + myIntegers[i]);
        }

        System.out.println("The average is " + getAverage(myIntegers));


        /*int[] my = new int[25];
        double[] myDoubleArray = new double[10];
        for(int i = 0; i < my.length; i++) {
            my[i] = i * 10;
        }
        for (int i = 0; i < my.length; i++) {
            System.out.println("element " + i + ", value is " + my[i]);
        }*/
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values:\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static  double getAverage(int[] array) {
        int sumTotal = 0;
        for (int i = 0; i < array.length; i++) {
            sumTotal += array[i];
        }
        return (double)sumTotal / (double)array.length;
    }

    /*public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("element " + i + ", value is " + array[i]);
        }
    }*/
}
