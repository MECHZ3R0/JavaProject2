package inheritance;

public class AttendanceTest {
    public static void main(String[] args) {
        String[] names={"Ab","Cd","Ef","Gh","Ij"};
        int[] id = {12,34,56,78,90};
        Attendance x = new Attendance(names,id);
        x.enterAttendance();
        x.printAttendance(x.enterAttendance());
    }

}
