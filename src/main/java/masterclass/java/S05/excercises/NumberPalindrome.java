package masterclass.java.S05.excercises;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int input = number;
        int originalNumber = number;
        int reversedNumber = 0;
        int lastDigit;

        if (number < 0) {
            number = number * (-1);
            originalNumber = originalNumber * (-1);
        }
        while (number > 0) {
            lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }
        System.out.println("Is given number " + input + " a palindrome");
        return reversedNumber == originalNumber;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
        System.out.println(isPalindrome(-202));
        System.out.println(isPalindrome(112211));
        System.out.println(isPalindrome(9669));
        System.out.println(isPalindrome(525));
        System.out.println(isPalindrome(47874));
        System.out.println(isPalindrome(985548));
        System.out.println(isPalindrome(54));
        System.out.println(isPalindrome(84125));
    }

}
