package timbuchalka.java.S08;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class AutoboxigUnboxing {

    public static void main(String[] args) {

        String[] array = new String[10];
        int[] arrayOne = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

        ArrayList<IntClass> intArrayList = new ArrayList<IntClass>();
        intArrayList.add(new IntClass(50));

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        //Autoboxing
        for (int i = 0; i <= 10; i++) {
            integerArrayList.add(Integer.valueOf(i));
        }
        //Unboxing
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " --> " + integerArrayList.get(i).intValue());
        }

        ArrayList<Double> doubleArrayList = new ArrayList<>();
        //Autoboxing
        for (double d = 0.0; d <= 10.0; d += 0.5) {
            doubleArrayList.add(d);
        }
        //Unboxing
        for (int i = 0; i < doubleArrayList.size(); i++) {
            double value = doubleArrayList.get(i);
            System.out.println(i + " --> " + value);
        }
    }
}
