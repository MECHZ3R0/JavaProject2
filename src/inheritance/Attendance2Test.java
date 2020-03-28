package inheritance;

public class Attendance2Test {
    public static void main(String[] args) {
        String[] people = {"Alpha", "Beta", "Gamma", "Delta", "Omega"};
        int[] id = {1,2,3,4,5};
        String[] subject = {"Engl", "Math", "Phys", "Chem","Biol"};
        Attendance2 attend = new Attendance2(people,id);
        LabAttendance labAttend = new LabAttendance(people,id,subject);
        attend.enterAttendanceToday("mon");
        attend.enterAttendanceToday("tue");
        attend.printWeeklyAttendance();
        System.out.println("\n");
        attend.findTheMostAttendance();
        attend.findTheMostAttendedDay();
        attend.printDailyAttendance("Fri");
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        labAttend.enterGrade(87,"Alpha");
        labAttend.enterAttendanceToday("mon");
        labAttend.enterAttendanceToday("tue");
        labAttend.printGrades();
        System.out.println("=====================================================================");
        labAttend.printAttendanceGrades();
    }
}