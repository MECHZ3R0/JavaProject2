package recursions;

public class HelloWorldGlobalVariable {
    static int count=0;
    public static void main(String[] args) {
        print();
    }
    public static void print(){
        count++;
        if (count<8){
            System.out.println("Hello World");
            print();
        }
    }
}
