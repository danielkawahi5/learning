package masterclass.java.S07.polymorphism.polymorphism_challenge;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine() {
        return "Car --> START engine";
    }

    public String accelerate() {
        return "Car --> ACCELERATE";
    }

    public String brake() {
        return "Car --> BRAKE";
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }
}

class Nissan extends Car {

    public Nissan(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " --> START engine";
    }

    @Override
    public String accelerate() {
        return "Nissan GTR --> ACCELERATE";
    }

    @Override
    public String brake() {
        return "Nissan GTR --> BRAKE";
    }
}

class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford GT --> START engine";
    }

    @Override
    public String accelerate() {
        return "Ford GT --> ACCELERATE";
    }

    @Override
    public String brake() {
        return "Ford GT --> BRAKE";
    }
}

class Porsche extends Car {
    public Porsche(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Prosche --> START engine";
    }

    @Override
    public String accelerate() {
        return "Prosche --> ACCELERATE";
    }

    @Override
    public String brake() {
        return "Prosche --> BRAKE";
    }

}

class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
        return super.brake();
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car(8, "Nissan");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Nissan nissan = new Nissan(16, "Nissan GTR");
        System.out.println(nissan.startEngine());
        System.out.println(nissan.accelerate());
        System.out.println(nissan.brake());

        Ford ford = new Ford(16, "Ford GT");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Porsche porsche = new Porsche(18, "Porsche 911 Turbo");
        System.out.println(porsche.startEngine());
        System.out.println(porsche.accelerate());
        System.out.println(porsche.brake());

        Holden holden = new Holden(18, "Porsche 911 Turbo");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

    }
}
