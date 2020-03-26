package inheritance;

public class Attendance2Test {
    public static void main(String[] args) {
        String[] people = {"Alpha", "Beta", "Gamma", "Delta", "Omega"};
        int[] id = {1,2,3,4,5};
        Attendance2 x = new Attendance2(people,id);
        x.enterAttendanceToday("mon");
        x.enterAttendanceToday("tue");
        x.printWeeklyAttendance();
        System.out.println("\n");
        x.findTheMostAttendance();
        x.findTheMostAttendedDay();
    }
}
