package inheritance;

public class BikeTest {
    public static void main(String[] args) {
        Bicycle myBike = new Bicycle(3,20);
        myBike.speedUp();
        RoadBike myRoadBike = new RoadBike(26,16,4,40);
        myRoadBike.speedUp();
    }
}
