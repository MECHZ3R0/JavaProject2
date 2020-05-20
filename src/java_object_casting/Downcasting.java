package java_object_casting;

public class Downcasting {
    public static void main(String[] args) {
        Appliances appliances = new Refrigerator();
        appliances.color();
        //Method 1:
        Refrigerator refrigerator = (Refrigerator) appliances;
        refrigerator.freeze();
        refrigerator.makeIce();
        //Method 2:
        ((Refrigerator) appliances).color();
        ((Refrigerator) appliances).freeze();
        ((Refrigerator) appliances).makeIce();
    }
}
class Appliances{
    public void color(){
        System.out.println("Metallic");
    }
}
class Refrigerator extends Appliances{
    public void freeze(){
        System.out.println("Freezing");
    }
    public void makeIce(){
        System.out.println("Making Ice");
    }
}
