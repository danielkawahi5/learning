package masterclass.java.S06.classes;

public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car bmw = new Car();

        porsche.setModel("bla");

        System.out.println("model is " + porsche.getModel());
    }
}
