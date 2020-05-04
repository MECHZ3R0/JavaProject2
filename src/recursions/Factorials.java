package recursions;

public class Factorials {
    public static void main(String[] args) {
        System.out.println(doFactorials(5));
    }
    public static int doFactorials(int n){
        if(n==1){
            return 1;
        }
        else{
            return (n*doFactorials(n-1));
        }
    }
}
