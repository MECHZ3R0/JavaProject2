package interfaces;

public abstract class RectangularShape implements Shape {
    private int width;
    private int height;
    double area=width+height;

    public boolean contains(int x, int y){
        return true;
    }
    public double getArea(){
        return area;
    }

}
