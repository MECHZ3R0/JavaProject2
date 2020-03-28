package abstraction;

public class TilingTest {
    public static void main(String[] args) {
        Tiling x=new Tiling("Arbitrary",4000,0,0);
        System.out.println(x.calculateTotalMaterialPrice("wood"));
        System.out.println(x.calculateTotalPrice());
        x.printQuete();
    }
}
