package timbuchalka.java.S05.excercises;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int first, int second, int third) {
        if ((first < 10 || first > 1000) || (second < 10 || second > 1000) || (third < 10 || third > 1000)) {
            return false;
        }
        int number1 = first % 10;
        int number2 = second % 10;
        int number3 = third % 10;

        return (number1 == number2) || (number1 == number3) || (number2 == number3);
    }

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(15,12,122));
        System.out.println(hasSameLastDigit(9,18,1228));

    }

}
