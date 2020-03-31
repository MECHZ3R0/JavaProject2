package interfaces;

public class Rectangle {
    private int x;
    private int y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double distance (Rectangle r){
        return x*y;
    }
}
