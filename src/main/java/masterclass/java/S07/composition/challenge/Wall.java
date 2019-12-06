package masterclass.java.S07.composition.challenge;

public class Wall {
    private String direction;
    private String color;

    public Wall(String direction, String color) {
        this.direction = direction;
        this.color = color;
    }

    public String getDirection() {
        return direction;
    }
}
