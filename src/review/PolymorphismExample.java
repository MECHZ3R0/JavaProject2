package review;

public class PolymorphismExample {
    public static void calculatePerimeter(int a, int b){
        System.out.println(2*(a+b));
    }
    public static void calculatePerimeter(int a){
        System.out.println(4*a);
    }
    public static void calculatePerimeter(double a){
        System.out.println(2*3.14*a);
    }
    public void calculateArea(int a, int b){
        System.out.println(a*b);
    }
    public void calculateArea(int a){
        System.out.println(a*a);
    }
    public void calculateArea(double a){
        System.out.println (3.14*a*a);
    }
}
