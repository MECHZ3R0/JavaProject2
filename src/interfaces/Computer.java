package interfaces;

public class Computer {
    protected String[] mainBoardSpec;
    protected int memorySize;
    protected double cpuSpeed;
    protected String cpuType;

    public Computer(String[] mainBoardSpec, int memorySize, double cpuSpeed, String cpuType) {
        this.mainBoardSpec = mainBoardSpec;
        this.memorySize = memorySize;
        this.cpuSpeed = cpuSpeed;
        this.cpuType = cpuType;
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
    void turnOn(){
        System.out.println("Computer is up!!!");
    }
    void turnOff(){
        System.out.println("Shutting Down!!!");
    }
    void boot(){
        System.out.println("Computer is booting up!!!");
    }
}
