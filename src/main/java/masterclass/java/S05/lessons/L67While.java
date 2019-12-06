package masterclass.java.S05.lessons;

public class L67While {

    public static boolean isEvenNumber(int number) {
        return (number % 2) == 0;
    }

    public static void main(String[] args) {

        int number = 0;
        int finishNumber = 100;
        int evenNumbersFound = 0;

        while(number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even numbers : " + number);

            evenNumbersFound++;
            if (evenNumbersFound >= 10) {
                break;
            }
        }

        System.out.println("even numbers found : " + evenNumbersFound);


        /*int count = 0;
        while (count != 10) {
            System.out.println("Counting: " + count);
            count++;
        }

        count = 0;
        while (true) {
            if (count == 10) {
                break;
            }
            System.out.println("Counting " + count);
            count++;
        }*/
    }
}
