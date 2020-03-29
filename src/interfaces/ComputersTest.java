package interfaces;

public class ComputersTest {
    public static void main(String[] args) {
        String[] mainboardspec={"Energy Star", "2.45","4048"};
        Laptop x = new Laptop(mainboardspec, 4048, 2.45, "intel",20);
        x.chargeBattery();
        x.installCPU("AMD");
        x.chargeBattery();
        x.showBatteryPercentage();

        Workstation y=new Workstation(mainboardspec, 4048, 2.45, "intel","large", 32);
        y.installMemory(6072);
        y.connectToNetwork();
        y.installCPU("AMD",3.10);
        y.setMainboard(mainboardspec);

        DellWorkstation z=new DellWorkstation(mainboardspec, 4048, 2.45, "intel","large", 32);
        z.installDellSoftware();
    }
}
