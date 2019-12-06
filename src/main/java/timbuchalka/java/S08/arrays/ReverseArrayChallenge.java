package timbuchalka.java.S08.arrays;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ReverseArrayChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        System.out.println("returnedArray = " + Arrays.toString(returnedArray));

        //Object[] reversedArray = invertUsingStreams(returnedArray);
        //int[] reversedArray = invertUsingCommonsLang(returnedArray);
        int[] reversedArray = invertUsingForLoop(returnedArray);
        System.out.println("reversed = " + Arrays.toString(reversedArray));
    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Type something: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    private static int[] invertUsingCommonsLang(int[] array) {
        ArrayUtils.reverse(array);
        return array;
    }

    private static Object[] invertUsingStreams(int[] array) {
        return IntStream.rangeClosed(1, array.length)
                .mapToObj(i -> array[array.length - i])
                .toArray();
    }

    private static int[] invertUsingForLoop(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}
