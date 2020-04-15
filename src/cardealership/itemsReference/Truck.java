package cardealership.itemsReference;

public class Truck implements ForSale {
    public int stickerPrice;
    public double managerPrice;

    public Truck(int stickerPrice){
        this.stickerPrice=stickerPrice;
    }

    public void setManagerPrice(double discountRate){
        this.managerPrice=stickerPrice*discountRate;
    }
}
