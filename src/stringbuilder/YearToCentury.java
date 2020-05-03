package stringbuilder;

public class YearToCentury {
    public static void main(String[] args) {
        String input = "1756";
        yearToCentury(input);
    }
    public static void yearToCentury(String input){
        int a=Integer.parseInt(""+input.charAt(0)+input.charAt(1));
        int b=Integer.parseInt(""+input.charAt(2)+input.charAt(3));
        int c=0;
        if (b>0){
            c=1;
        }
        System.out.println(a+c+"th century");
    }
}
