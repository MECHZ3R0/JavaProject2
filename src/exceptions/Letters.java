package exceptions;

        import java.util.Scanner;

public class Letters {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Write something: ");
        String a=x.nextLine();
        nextL(a);
    }
    static void nextL(String a){
        String b=null;
        for (int i=0;i<a.length();i++){
            b+=(char)(a.charAt(i)+1);
        }
        try{
            if (!b.equalsIgnoreCase(a))
            System.out.println(b);
        }
        catch(NullPointerException e){
            System.out.println("Please write something");
        }
    }
}
