package review;

public class InheritanceExampleTest {
    public static void main(String[] args) {
        InheritanceExample x=new InheritanceExample(2,3);
        System.out.println(x.additionPublic(1,2));
        System.out.println(x.additionPublic(1,2));
        System.out.println(InheritanceExample.additionPublicStatic(2,3));
    }
}
