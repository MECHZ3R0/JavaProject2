package review;

public class InheritanceExample {
    int a, b;

    public InheritanceExample(int a, int b) {
        this.a = a;
        this.b = b;
    }

    private static int additionPrivateStatic(int a, int b){
        return a+b;
    }
    public static int additionPublicStatic(int a, int b){
        return a+b;
    }
    private int additionPrivate(int a, int b){
        return a+b;
    }
    public int additionPublic(int a, int b){
        return a+b;
    }
}
