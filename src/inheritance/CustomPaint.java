package inheritance;

public class CustomPaint extends Paint {
    String glossiness;
    String durability;

    public CustomPaint(String colorName, double sqrFeet, double totalPrice, String glossiness, String durability) {
        super(colorName, sqrFeet, totalPrice);
        this.glossiness = glossiness;
        this.durability = durability;
    }
    public double changeGloss(String newGloss){
        glossiness=newGloss;
        if (glossiness.equalsIgnoreCase("Glossy")){
            totalPrice+=sqrFeet*2/100;
        }
        else if (glossiness.equalsIgnoreCase("Extra Glossy")){
            totalPrice+=sqrFeet*3/100;
        }
        return totalPrice;
    }
    public double changeDurability(String newDurability){
        glossiness=newDurability;
        if (durability.equalsIgnoreCase("Durable")){
            totalPrice+=sqrFeet*2/100;
        }
        else if (durability.equalsIgnoreCase("Super Durable")){
            totalPrice+=sqrFeet*3/100;
        }
        return totalPrice;
    }
}
