package cardealership.itemsReference;

public class Car implements ForSale{
    public int stickerPrice;
    public double managerPrice;

    public Car(int stickerPrice){
        this.stickerPrice=stickerPrice;
    }

    public void setManagerPrice(double discountRate){
        this.managerPrice=stickerPrice*discountRate;
    }
}
