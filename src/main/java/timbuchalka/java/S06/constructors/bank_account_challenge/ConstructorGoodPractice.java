package timbuchalka.java.S06.constructors.bank_account_challenge;

public class ConstructorGoodPractice {
    // class Rectangle

    private int x;
    private int y;
    private int width;
    private int height;


    public ConstructorGoodPractice(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public ConstructorGoodPractice(int width, int height) {
        this(0,0,width,height);
    }

    public ConstructorGoodPractice() {
        this(0,0);
    }



    /*public ConstructorGoodPractice() {
        this(0,0);
    }

    public ConstructorGoodPractice(int width, int height) {
        this(0,0,width,height);
    }

    public ConstructorGoodPractice(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

    }*/



}
