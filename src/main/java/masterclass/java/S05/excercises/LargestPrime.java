package masterclass.java.S05.excercises;

public class LargestPrime {

    public static int getLargestPrime(int number) {
        if (number <= 2) {
            return -1;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    number /= i;
                    i--;
                }
            }
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

}
