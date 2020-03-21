package inheritance;

public class DepartmentTest {
    public static void main(String[] args) {
        Department myEmp = new Department("Sample",123, "Food", 90000);
        ITdepartment myIT = new ITdepartment("Abstract", 121,"IT",99000, "Java");
        AccountingDepartment myAcc = new AccountingDepartment("Rich", 120,"Budget", 9195,4);
        System.out.println(myEmp.toString());
        myEmp.changePosition("IT");
        myEmp.riseSalary(5000);
        System.out.println(myEmp.toString());
        System.out.println("------------------");
        System.out.println(myIT.toString());
        myIT.addSkillSet("Python");
        myIT.addSkillSet("SQL");
        myIT.riseSalary(14880);
        System.out.println(myIT.toString());
        System.out.println("------------------");
        System.out.println(myAcc.toString());
        myAcc.addExperienceYears(2);
        myAcc.riseSalary(2000);
        System.out.println(myAcc.toString());
    }
}
