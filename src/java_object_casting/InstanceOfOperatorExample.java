package java_object_casting;

public class InstanceOfOperatorExample {
    public static void main(String[] args) {
        GardenTool a = new GardenTool();
        if(a instanceof GardenTool){
            System.out.println("It belongs to GardenTool variable");
        }
        GardenTool b = new LawnMover();
        if(b instanceof GardenTool){
            System.out.println("It belongs to GardenTool variable");
        }
        LawnMover c = new LawnMover();
        if(c instanceof LawnMover){
            System.out.println("It belongs to LawnMover variable");
        }
        if(c instanceof GardenTool){
            System.out.println("It belongs to GardenTool variable");
        }
    }
}
class GardenTool{
    void start(){
        System.out.println("started");
    }
}
class LawnMover extends GardenTool{
    void move(){
        System.out.println("moving");
    }
}
