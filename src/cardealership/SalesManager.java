package cardealership;

import cardealership.itemsObject.Car;
import cardealership.itemsObject.Part;
import cardealership.itemsObject.Truck;
import cardealership.itemsReference.ForSale;

public class SalesManager {
    //for itemsObject:
//    public static void setPartManagerPrice(Part part){
//        part.setManagerPrice(part.stickerPrice*0.8);
//    }
//    public static void setCarManagerPrice(Car car){
//        car.setManagerPrice(car.stickerPrice*0.75);
//    }
//    public static void setTruckManagerPrice(Truck truck){
//        truck.setManagerPrice(truck.stickerPrice*0.9);
//    }

    //for itemsReference:
//    public static void setManagerPrice(ForSale items){
//        items.setManagerPrice(0.75);
//    }

    //for itemsReference as an Array:
    public static void setManagerPrice(ForSale[] items){
        for(ForSale item:items){
            item.setManagerPrice(0.75);
        }
    }
}
