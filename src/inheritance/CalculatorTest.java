package inheritance;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        System.out.println("Calculator Display: "+myCalc.Add(2,3));
        AdvancedCalculator myAdv= new AdvancedCalculator();
        System.out.println("Advanced Calculator Display: "+myAdv.Factorial(3));
    }
}
