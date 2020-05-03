package questions;

public class StrongPassword {
    public static void main(String[] args) {
        int length = 10;
        String input = "sasdsafsdf";
        if(length(input)&isDigit(input)&isUpperCase(input)&isLowerCase(input)&isSpecialCase(input)){
            System.out.println("Strong Password");
        }
        else{
            System.out.println("Weak Password");
        }
    }
    public static boolean length(String str){
        if (str.length()<6){
            System.out.println(6-str.length());
        }
        return str.length()>6?true:false;
    }
    public static boolean isDigit(String str){
        boolean x=false;
        for (int i = 0; i <str.length() ; i++) {
            if (Character.isDigit(str.charAt(i))){
                x=true;
            }
        }
        if (!x){
            System.out.println("1");
        }
        return x;
    }
    public static boolean isLowerCase(String str){
        boolean x=false;
        for (int i = 0; i <str.length() ; i++) {
            if (Character.isLowerCase(str.charAt(i))){
                x=true;
            }
        }
        if (!x){
            System.out.println("a");
        }
        return x;
    }
    public static boolean isUpperCase(String str){
        boolean x=false;
        for (int i = 0; i <str.length() ; i++) {
            if (Character.isUpperCase(str.charAt(i))){
                x=true;
            }
        }
        if (!x){
            System.out.println("A");
        }
        return x;
    }
    public static boolean isSpecialCase(String str){
        boolean x=false;
        for (int i = 0; i <str.length() ; i++) {
            if (!(Character.isDigit(str.charAt(i)))&&(!Character.isUpperCase(str.charAt(i)))&&(!Character.isLowerCase(str.charAt(i)))){
                x=true;
            }
        }
        if (!x){
            System.out.println("#");
        }
        return x;
    }
}
