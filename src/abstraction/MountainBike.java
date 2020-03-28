package abstraction;

public class MountainBike extends UnknownBicycle {
    String tireType;
    int seatHeight;
    int speed;
    public MountainBike(String tireType, int seatHeight) {
        super();
        this.tireType = tireType;
        this.seatHeight = seatHeight;
        speed=10;
    }
    int speedUp(){
        return speed++;
    }
    int slowDown(){
        return speed--;
    }
    int stop(){
        return speed=0;
    }
    int start(){
        return speed=1;
    }
    void switchToSteepMode(){
        this.tireType="High Friction";
        this.seatHeight=1;
        this.speed=5;
    }
}
