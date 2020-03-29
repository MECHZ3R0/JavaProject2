package interfaces;

public class Workstation extends Computer implements Computers {
    private String housingType;
    private int screenSize;

    public Workstation(String[] mainBoardSpec, int memorySize, double cpuSpeed, String cpuType, String housingType, int screenSize) {
        super(mainBoardSpec, memorySize, cpuSpeed, cpuType);
        this.housingType = housingType;
        this.screenSize = screenSize;
    }
    void connectToNetwork(){
        System.out.println("Network is Connected!!!");
    }
    public void setMainboard(String[] mainBoard){
        this.mainBoardSpec=mainBoard;
        System.out.println("CPU Type: "+ this.mainBoardSpec[0]);
        System.out.println("CPU Speed: "+this.mainBoardSpec[1]);
        System.out.println("Memory Size: "+ this.mainBoardSpec[2]);
        System.out.println("Mainboard Systems are ready!!!");
    }
    public void installCPU(String newCPUtype, double cpu){
        this.cpuType=newCPUtype;
        this.mainBoardSpec[0]=this.cpuType;
        double newCPUSpeed=Double.parseDouble(this.mainBoardSpec[1]);
        if (cpu<newCPUSpeed){
            System.out.println("New CPU is slower than old one");
        }
        else {
            this.mainBoardSpec[1]=""+cpu;
            System.out.println("New CPU is installed!!!");}

    }
    public void installMemory(int memory){
        this.memorySize=memory;
    }
}
