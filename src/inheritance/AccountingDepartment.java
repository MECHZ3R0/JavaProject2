package inheritance;

public class AccountingDepartment extends Department{
    private int experienceYears;

    public AccountingDepartment(String employeeName, int employeeID, String position, double salary, int experienceYears) {
        super(employeeName, employeeID, position, salary);
        this.experienceYears = experienceYears;
    }

    public void addExperienceYears(int experienceYears) {
        this.experienceYears += experienceYears;
    }

    @Override
    public String toString() {
        return "AccountingDepartment{" +
                "experienceYears=" + experienceYears +
                ", employeeName='" + employeeName + '\'' +
                ", employeeID=" + employeeID +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
