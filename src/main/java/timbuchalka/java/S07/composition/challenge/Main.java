package timbuchalka.java.S07.composition.challenge;

public class Main {

    public static void main(String[] args) {
        Wall wall1 = new Wall("West", "blue");
        Wall wall2 = new Wall("East", "white");
        Wall wall3 = new Wall("North", "blue");
        Wall wall4 = new Wall("South", "white");

        Ceiling ceiling = new Ceiling(15,20);

        Bed bed = new Bed("good", 5, 100, 5, 2);

        Lamp lamp = new Lamp("ancient", false, 79);

        Painting painting = new Painting(true);

        Window window = new Window("wood");

        Closet closet = new Closet(250);

        Carpet carpet = new Carpet("nice fabric", "black", 120, 150);

        Bedroom bedroom = new Bedroom("Daniels", wall1, wall2, wall3, wall4, ceiling, bed, window, lamp, carpet, closet, painting);
        bedroom.getLamp().turnOn();
        bedroom.makeBed();
        bedroom.getPainting().beautifulPainting();

    }


}
