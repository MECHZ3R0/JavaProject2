package inheritance;

public class AdvancedCalculator extends Calculator{
    private String screenColor;
    AdvancedCalculator(){
        super();
        this.screenColor="Blue";
    }
    double Average(double x, double y){
        return displayValue=(x+y)/2;
    }
    double Factorial(double x){
        for (int i=(int)x-1;i>0;i--) x*=i;
        return displayValue=x;
    }
    double Sqrt(double x){
        return displayValue=Math.sqrt(x);
    }
    double pow(double x, double y){
        return displayValue=Math.pow(x,y);
    }
}
