package enums;

public class First {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }
    public static void main(String[] args) {
        Level myEnumVar = Level.MEDIUM;
        System.out.println(myEnumVar);
    }
}
