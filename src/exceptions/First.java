package exceptions;

public class First {
    public static void main(String[] args) {
        int x=10;
        int y=0;
        try{
            System.out.println(x/y);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("The continuation of the code");
    }
}
