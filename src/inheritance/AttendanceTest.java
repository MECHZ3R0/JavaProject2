package inheritance;

public class AttendanceTest {
    public static void main(String[] args) {
        String[] names={"","Siri","Alexa","Cortana","Google","Bixby"};
        int[] id = {12,34,56,78,90};
        Attendance x = new Attendance(names,id);
        x.enterAttendance();
        x.printWeeklyAttendance(x.enterAttendance());
        x.printMostAttendedPerson(x.enterAttendance());
        x.printMostAttndedDay(x.enterAttendance());
    }

}
