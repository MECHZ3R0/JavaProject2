package cardealership.itemsReference;

public class Part implements ForSale {
    public int stickerPrice;
    public double managerPrice;

    public Part(int stickerPrice){
        this.stickerPrice=stickerPrice;
    }

    public void setManagerPrice(double discountRate){
        this.managerPrice=stickerPrice*discountRate;
    }
}
