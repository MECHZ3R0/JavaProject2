package inheritance;

public class PaintTest {
    public static void main(String[] args) {
        Paint x= new Paint("Green",0,0);
        CustomPaint y =new CustomPaint("Green",200,0,"Glossy","Durable");
        System.out.println(y.calculatePrice());
        System.out.println(y.changeGloss("Extra Glossy"));
        System.out.println(y.changeDurability("Super Durable"));
    }
}
