package review;

public class RetailStore {
    public String listOfProducts;
    private int inventoryQuantity;
    private static int totalInventoryQuantities;

    public RetailStore(String listOfProducts, int inventoryQuantity) {
        this.listOfProducts = listOfProducts;
        this.inventoryQuantity = inventoryQuantity;
        totalInventoryQuantities+=inventoryQuantity;
    }
    public void receive(int quantity){
        inventoryQuantity+=quantity;
        totalInventoryQuantities+=quantity;
    }
    private void sell(int quantity){
        inventoryQuantity-=quantity;
        totalInventoryQuantities-=quantity;
    }
    void showInventory(){
        System.out.println(listOfProducts+" Quantity = "+inventoryQuantity);
    }
    static void showAllInventory(){
        System.out.println("Total Quantity = "+totalInventoryQuantities);
    }
}
