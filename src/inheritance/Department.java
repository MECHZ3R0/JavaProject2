package inheritance;

public class Department {
    protected String employeeName;
    protected int employeeID;
    protected String position;
    protected double salary;

    public Department(String employeeName, int employeeID, String position, double salary) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Department{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeID=" + employeeID +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void changePosition(String position) {
        this.position = position;
    }

    public void riseSalary(double rise) {
        this.salary += rise;
    }
}
