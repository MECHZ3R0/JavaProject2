package inheritance;

public class ITdepartment extends Department {
    private String skillSet;

    public ITdepartment(String employeeName, int employeeID, String position, double salary, String skillSet) {
        super(employeeName, employeeID, position, salary);
        this.skillSet = skillSet;
    }

    public void addSkillSet(String skillSet) {
        this.skillSet = this.skillSet+", "+skillSet;
    }

    @Override
    public String toString() {
        return "ITdepartment{" +
                "skillSet='" + skillSet + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeID=" + employeeID +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
