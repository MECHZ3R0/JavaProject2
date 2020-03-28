package abstraction;

public class Tiling extends Quete {
    private double material;

    public Tiling(String customerName, double squareFeet, double price, double material) {
        super(customerName, squareFeet, price);
        this.material = material;
    }

    double calculateTotalMaterialPrice(String materialType){
        if (materialType.equalsIgnoreCase("wood")){
             return material=squareFeet*2.4;
        }
        else if (materialType.equalsIgnoreCase("tile")){
             return material=squareFeet*1.99;
        }
        else{
            System.out.println("Material was not recognized!");
            return material;
        }

    }
    double calculateTotalPrice(){
        return price=material+4*squareFeet;
    }

    public void printQuete() {
        System.out.println("Tiling{" +
                "material=" + material +
                ", customerName='" + customerName + '\'' +
                ", squareFeet=" + squareFeet +
                ", price=" + price +
                ", Material Price=" + material +
                ", Total Price=" + price +
                '}');
    }
}
