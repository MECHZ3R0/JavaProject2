package inheritance;

public class Paint {
    protected String colorName;
    protected double sqrFeet;
    protected double totalPrice;

    public Paint(String colorName, double sqrFeet, double totalPrice) {
        this.colorName = colorName;
        this.sqrFeet = sqrFeet;
        this.totalPrice = totalPrice;
    }
    public double calculatePrice(){
        return totalPrice=sqrFeet*32.99/100;
    }

    @Override
    public String toString() {
        return "Paint{" +
                "colorName='" + colorName + '\'' +
                ", sqrFeet=" + sqrFeet +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
