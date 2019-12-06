package timbuchalka.java.S06.inheritance.inheritance_challenge;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Tundra tundra = new Tundra(24);
        tundra.steer(39);
        tundra.accelerate(90);
        tundra.accelerate(50);
        tundra.accelerate(1);

        int in = 0;
        int max = Arrays.asList(Integer
                .toBinaryString(in)
                .split("1"))
                .stream()
                .mapToInt(zeros -> zeros.length())
                .max()
                .getAsInt();


    }
}
