package masterclass.java.S06.excercises.carpet_cost_calculator;

public class Carpet {

    private double cost;

    public Carpet(double cost) {
        if (cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }

    public double getCost() {
        return this.cost;
    }
}
