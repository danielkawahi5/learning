package masterclass.java.S05.excercises;

public class FlourProblem {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal <= 0) {
            return false;
        }

        goal -= Math.min(goal / 5, bigCount) * 5;
        return (smallCount >= goal);
    }

    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
    }

}
