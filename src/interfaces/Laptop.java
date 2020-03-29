package interfaces;

public class Laptop implements Computers {
    protected String[] mainBoardSpec;
    protected int memorySize;
    protected double cpuSpeed;
    protected String cpuType;
    protected int batteryPercentage;

    public Laptop(String[] mainBoardSpec, int memorySize, double cpuSpeed, String cpuType, int batteryPercentage) {
        this.mainBoardSpec = mainBoardSpec;
        this.memorySize = memorySize;
        this.cpuSpeed = cpuSpeed;
        this.cpuType = cpuType;
        this.batteryPercentage = batteryPercentage;
    }
    public void setMainboard(String[] mainBoard){
        this.mainBoardSpec=mainBoard;
    }
    public void installCPU(String cpu){
        this.cpuType=cpu;
    }
    public void installMemory(int memory){
        this.memorySize=memory;
    }
    void chargeBattery(){
        if (batteryPercentage<100)
        this.batteryPercentage++;
    }
    void showBatteryPercentage(){
        System.out.println(this.batteryPercentage);
    }
}
