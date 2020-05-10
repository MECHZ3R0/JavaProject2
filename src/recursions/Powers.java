package recursions;

public class Powers {
    public static void main(String[] args) {
        System.out.println(power(2,3));
    }
    public static long power(int number, int power){
        if (power==0){
            return 1;
        }
        else {
            return number*power(number, --power);
        }
    }
}
