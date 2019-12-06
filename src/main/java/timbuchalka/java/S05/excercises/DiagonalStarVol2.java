package timbuchalka.java.S05.excercises;

public class DiagonalStarVol2 {

    public static void printDiagonalStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            System.out.println();
            System.out.println();

            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    if (i==0 || (i == number -1) || j == 0 || (j == number -1) || (i == j) || ((j + 1) == number - (i + 1) + 1 )) {
                        System.out.println("*");
                    } else {
                        System.out.println(" ");
                    }
                    System.out.println();
                }
            }
        }
    }
    public static void main(String[] args) {
        printDiagonalStar(1);
        printDiagonalStar(5);
        printDiagonalStar(9);
    }
}
