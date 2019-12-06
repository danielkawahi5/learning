package masterclass.java.S07.composition.challenge;

public class Carpet {

    private String fabric;
    private String color;
    private int length;
    private int width;

    public Carpet(String fabric, String color, int length, int width) {
        this.fabric = fabric;
        this.color = color;
        this.length = length;
        this.width = width;
    }

    public String getFabric() {
        return fabric;
    }

    public String getColor() {
        return color;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
