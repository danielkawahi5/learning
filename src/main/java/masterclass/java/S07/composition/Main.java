package masterclass.java.S07.composition;

public class Main {
    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20,40,60);
        Case theCase = new Case("14A", "Remo", "240", dimensions);

        Monitor theMonitor = new Monitor("Omn", "HP", 29, new Resolution(2589, 1548));

        Motherboard theMotherboard = new Motherboard("asd747", "Asus", 8, 4, "v144");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        thePC.powerUp();
    }
}
