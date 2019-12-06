package masterclass.java.S07.composition.challenge;

public class Painting {

    private boolean isPaintingInTheBedroom;

    public Painting(boolean isPaintingInTheBedroom) {
        this.isPaintingInTheBedroom = isPaintingInTheBedroom;
    }

    public boolean isPaintingInTheBedroom() {
        return isPaintingInTheBedroom;
    }

    public void beautifulPainting() {
        System.out.println("There is amazing Picasso on the wall");
    }
}
