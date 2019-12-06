package masterclass.java.S07.composition.challenge;

public class Bedroom {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Window window;
    private Lamp lamp;
    private Carpet carpet;
    private Closet closet;
    private Painting painting;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Window window, Lamp lamp, Carpet carpet, Closet closet, Painting painting) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.window = window;
        this.lamp = lamp;
        this.carpet = carpet;
        this.closet = closet;
        this.painting = painting;
    }

    public Lamp getLamp() {
        return this.lamp;
    }

    public void makeBed() {
        System.out.println("Bedroom ---> making bed");
        bed.make();
    }

    public Painting getPainting() {
        return this.painting;
    }
}
