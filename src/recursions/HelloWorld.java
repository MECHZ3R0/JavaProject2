package recursions;

public class HelloWorld {
    public static void main(String[] args) {
        int count=0;
        write(count);
    }
    static void write(int count){
        count++;
        if(count<5){
            System.out.println("Hello World");
            write(count);
        }

    }
}
