package java_classes;

public class CurlyBraces {
    public static void main(String[] args) {
        Curly a = new Curly();
        System.out.println("-----------");
        Curly b = new Curly(10);
    }
}
class Curly{
    int a;
    public Curly(){

    }
    public Curly(int a) {
        this.a = a;
        System.out.println("Object made with parameter "+this.a);
    }
    {
        System.out.println(this.a);
        System.out.println("Hello");
    }
}
