package java_classes;

public class NestedClassHouse {
    public static void main(String[] args) {
        House house = new House(2,2);
        house.status();
        house.garage();
        System.out.println(house instanceof House);

        House.Room room = house.new Room(2);
        room.type();
        System.out.println(room instanceof House.Room);

        House.Garage garage = new House.Garage(2);
        garage.cars();
        System.out.println(garage instanceof House.Garage);
    }
}
class House{
    int extDoors;
    int floors;
    public House(int extDoors, int floors) {
        this.extDoors = extDoors;
        this.floors = floors;
    }
    public void status(){
        System.out.println("House is new");
    }
    public void garage(){
        System.out.println("House has a garage");
    }
    class Room{
        int windows;
        public Room(int windows) {
            this.windows = windows;
        }
        public void type(){
            System.out.println("This is a living room");
        }
    }
    static class Garage{
        int numberOfCars;
        public Garage(int numberOfCars) {
            this.numberOfCars = numberOfCars;
        }
        public void cars(){
            System.out.println("Garage has 2 cars");
        }
    }
}
