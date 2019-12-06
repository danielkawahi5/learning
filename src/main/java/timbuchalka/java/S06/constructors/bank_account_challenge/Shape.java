package timbuchalka.java.S06.constructors.bank_account_challenge;

public class Shape {
    private int x;
    private int y;

    public Shape(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Rectangle extends Shape {

    private int width;
    private int height;



    public Rectangle(int x, int y) {
        this(x, y, 0, 0);
    }

    public Rectangle(int x, int y, int width, int height) {
        super(x,y);
        this.width = width;
        this.height = height;
    }

    public int add(Object a, Object b){
        return (int)a + (int)b;
    }


}
