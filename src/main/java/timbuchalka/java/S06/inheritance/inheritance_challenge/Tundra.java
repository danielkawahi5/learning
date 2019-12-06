package timbuchalka.java.S06.inheritance.inheritance_challenge;

public class Tundra extends Car {
    private int roadServiceMonths;

    public Tundra(int roadServiceMonths) {
        super("Tundra", "4WD", 5, 5, 8, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {

        int newVelocity = getCurrentVelocity() + rate;

        if (newVelocity == 0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 40) {
            changeGear( 3);
        } else if (newVelocity > 40 && newVelocity <= 70) {
            changeGear( 4);
        } else if (newVelocity > 70 && newVelocity <= 110){
            changeGear(5);
        } else if (newVelocity > 110 && newVelocity <= 160) {
            changeGear(6);
        } else if (newVelocity > 160 && newVelocity <= 190) {
            changeGear(7);
        } else {
            changeGear(8);
        }

        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
