package recursions;

public class FibonacciSequence {
    static long sum1=1, sum2=1;
    public static void main(String[] args) {
        sequence1(70);
        System.out.println(sequence2(40));
    }
    public static void sequence1(int length){
        if (length>1){
            System.out.println(sum2);
            System.out.println(sum1);
            sum2+=sum1;
            sum1+=sum2;
            sequence1(length-2);
        }
        else if (length==1){
            System.out.println(sum2);
        }
    }
    public static long sequence2(int length){
        if (length<=2){
            return 1;
        }
        else {
            return sequence2(length-2)+sequence2(length-1);
        }
    }
}
