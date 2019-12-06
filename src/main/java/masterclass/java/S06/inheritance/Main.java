package masterclass.java.S06.inheritance;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("animal",1,1,5,5);

        Dog dog = new Dog("Bob",2,3,4,5,7,15, "long");
        dog.eat();
    }
}
