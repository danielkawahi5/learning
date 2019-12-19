package fun;

public class FeetToInchesConverter {

    public double convertFeetToInches(double feet, double inches) {
        System.out.println("Converting...");
        double centimeters;
        centimeters = ((feet * 12 + inches) * 2.54);
        System.out.println(feet + " feet and " + inches + " inches is " + centimeters + " centimeters.");

        return centimeters;

    }

}
