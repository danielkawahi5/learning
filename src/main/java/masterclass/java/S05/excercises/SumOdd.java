package masterclass.java.S05.excercises;

public class SumOdd {

        public static boolean isOdd(int number){
            if ((number > 0) && (number % 2 != 0)) {
                return true;
            } else {
                return false;
            }
        }

        public static int sumOdd(int start, int end) {
            int sumOfTheOddNumbers = 0;
            if (start > 0 && end > 0 && end >= start) {
                for (int i = start; i < end; i++){
                    if (isOdd(i)){
                        sumOfTheOddNumbers = sumOfTheOddNumbers + i;
                    }
                }
                return sumOfTheOddNumbers;
            } else {
                return -1;
            }
        }


    // ROZWIĄZANIE MARIUSZA <3
    /*public static int sumOdd(int start, int end) {
        int sumOfTheOddNumbers = 0;
        if (!(start > 0 && end > 0 && end >= start)) {
            return -1;
        }
        for (int i = start; i <= end; i++){
            if (isOdd(i)){
                sumOfTheOddNumbers += i;
            }
        }
        return sumOfTheOddNumbers;
    }*/

    public static void main(String[] args) {
        sumOdd(1,100);
    }
}
