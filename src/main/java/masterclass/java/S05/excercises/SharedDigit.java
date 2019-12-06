package masterclass.java.S05.excercises;

public class SharedDigit {

    public static boolean hasSharedDigit(int firstDigit, int secondDigit) {
        if (firstDigit < 10 || firstDigit > 99 || secondDigit < 10 || secondDigit > 99) {
            return false;
        }
        return (firstDigit / 10 == secondDigit / 10) || (firstDigit / 10 == secondDigit % 10) ||
                (firstDigit % 10 == secondDigit / 10) || (firstDigit % 10 == secondDigit % 10);

    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(28, 38));
    }

}
