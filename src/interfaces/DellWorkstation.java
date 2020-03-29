package interfaces;

public class DellWorkstation extends Workstation {
    public DellWorkstation(String[] mainBoardSpec, int memorySize, double cpuSpeed, String cpuType, String housingType, int screenSize) {
        super(mainBoardSpec, memorySize, cpuSpeed, cpuType, housingType, screenSize);
    }
    void installDellSoftware(){
        System.out.println("Dell Software installation is complete!");
    }
}
