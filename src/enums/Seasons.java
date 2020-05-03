package enums;

public class Seasons {
    enum Season {
        SPRING,
        SUMMER,
        AUTUMN,
        WINTER
    }
    public static void main(String[] args) {
        Season myEnumVar = Season.SPRING;
        System.out.println(myEnumVar);
        System.out.println();
        for(Season s:Season.values()){
            System.out.println(s);
        }
    }
}
