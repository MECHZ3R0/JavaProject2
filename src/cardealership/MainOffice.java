package cardealership;

//import cardealership.itemsObject.Car;
import cardealership.itemsReference.Car;
import cardealership.itemsReference.ForSale;
import cardealership.itemsReference.Part;
import cardealership.itemsReference.Truck;

public class MainOffice {
    public static void main(String[] args) {
        Car corolla=new Car(18000);
        Truck ford=new Truck(70000);
        Part engine=new Part(3200);

        //for itemsObject:
//        SalesManager.setCarManagerPrice(corolla);

        //for itemsReference:
//        SalesManager.setManagerPrice(corolla);
//        SalesManager.setManagerPrice(ford);
//        SalesManager.setManagerPrice(engine);

        // for itemsReference as an Array:
        ForSale[] arr=new ForSale[] {corolla,engine,ford};
        SalesManager.setManagerPrice(arr);

        //for itemsObject, itemsReference and itemsReference as an Array:
        System.out.println(corolla.managerPrice);
        System.out.println(ford.managerPrice);
        System.out.println(engine.managerPrice);

    }
}
