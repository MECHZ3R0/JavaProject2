package review;

public class RetailStoreTest {
    public static void main(String[] args) {
        RetailStore product1= new RetailStore("Toy car", 300);
        RetailStore product2=new RetailStore("Lego", 450);
        product1.showInventory();
        product2.showInventory();
        RetailStore.showAllInventory();
        product1.receive(50);
        product1.showInventory();
        RetailStore.showAllInventory();
    }
}
