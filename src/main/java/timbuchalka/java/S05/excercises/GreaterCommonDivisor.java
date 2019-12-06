package timbuchalka.java.S05.excercises;

public class GreaterCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int smaller = Math.min(first, second);
        for(int i = smaller; i >= 1; i--) {
            if ((first % i == 0) && (second % i == 0)) {
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(1,15));
        System.out.println(getGreatestCommonDivisor(10,15));
        System.out.println(getGreatestCommonDivisor(9,99));
        System.out.println(getGreatestCommonDivisor(22,88));
    }
}
