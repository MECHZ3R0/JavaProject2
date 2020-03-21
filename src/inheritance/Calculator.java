package inheritance;

public class Calculator {
    protected double displayValue;

    public Calculator() {
        displayValue=0;
        System.out.println("Display: "+displayValue);
    }

    public double Add(double x, double y){
        return displayValue=x+y;
    }
    public double Divide(double x, double y){
        return displayValue=x/y;
    }
    public double Subtract(double x, double y){
        return displayValue=x-y;
    }
    public double Multiply(double x, double y){
        return displayValue=x*y;
    }
}
