package timbuchalka.java.S05.lessons;

public class L70ParsingString {

    public static void main(String[] args) {
        String numberAsString = "1992";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);

        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

    }

}
