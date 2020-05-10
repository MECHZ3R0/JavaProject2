package recursions;

public class RecursionExampleWithIfControlStructure {
    public static void main(String[] args) {
        Recursions(5);
    }
    public static void Recursions(int count){
        System.out.println(count);
        if (count>0){
            Recursions(--count);
        }
    }
}
