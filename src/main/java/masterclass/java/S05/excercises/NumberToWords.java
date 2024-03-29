package masterclass.java.S05.excercises;


public class NumberToWords {

    public static void nubmerToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int reversed = reverse(number);
            int originalNumberDigit = getDigitCount(number);

            for (int i = 0; i < originalNumberDigit; i++) {
                int digit = reversed % 10;

                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;

                }
                reversed /= 10;
            }

        }
    }
    public static int reverse(int number) {
        int reversedNumber = 0;
        int lastDigit = 0;

        while (number != 0){
            lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        int sumOfDigits = 0;
        if (number >= 0) {
            if (number == 0) {
                sumOfDigits = 1;
            }
            while (number > 0) {
                number /= 10;
                sumOfDigits++;
            }
            return sumOfDigits;
        }
        return -1;
    }

    public static void main(String[] args) {
        nubmerToWords(1984);
        nubmerToWords(0);
    }

}
