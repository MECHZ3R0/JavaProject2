package java_object_casting;

public class ComputerTest {
    public static void main(String[] args) {
        Laptop a = new Laptop();
        a.turnOn();
        a.turnOff();
        a.charge();
        Computer b = new Laptop();
        b.turnOn();
        b.turnOff();
        System.out.println(a instanceof Computer);
        System.out.println(a instanceof Laptop);
        System.out.println(b instanceof Computer);
        System.out.println(b instanceof Laptop);
    }
}
class Laptop implements Computer{
    public void turnOn(){
        System.out.println("ON");
    }
    public void turnOff(){
        System.out.println("OFF");
    }
    void charge(){
        System.out.println("Charging");
    }
}
