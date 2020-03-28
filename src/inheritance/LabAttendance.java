package inheritance;

public class LabAttendance extends Attendance2 {
    String[] labSubjects;
    private int[][] labGrades;

    public LabAttendance(String[] nameList, int[] idList, String[] labSubjects) {
        super(nameList, idList);
        this.labSubjects = labSubjects;
        this.labGrades=new int[this.labSubjects.length][super.nameList.length];
    }

    public void enterGrade(int grade, String name){
        for (int i=0;i<this.labSubjects.length;i++) {
            for (int j = 0; j < this.nameList.length; j++) {
                if (name.equalsIgnoreCase("Alpha")) {
                    this.labGrades[i][0] = grade;
                }
                else if (name.equalsIgnoreCase("Beta")) {
                    this.labGrades[i][1] = grade;
                }
                else if (name.equalsIgnoreCase("Gamma")) {
                    this.labGrades[i][2] = grade;
                }
                else if (name.equalsIgnoreCase("Delta")) {
                    this.labGrades[i][3] = grade;
                }
                else if (name.equalsIgnoreCase("Omega")) {
                    this.labGrades[i][4] = grade;
                }
            }
        }
    }
    public void printGrades(){
        System.out.print("\t\t\t");
        for (String names: this.nameList){
            System.out.print(names+"\t");
        }
        System.out.println();
        System.out.println("__________________________________________________________________");
        for (int i=0;i<this.labSubjects.length;i++){
            System.out.print(this.labSubjects[i]+"\t|\t");
            for (int j=0;j<this.nameList.length;j++){
                System.out.print(labGrades[i][j]+"\t\t");
            }
            System.out.println();
        }
    }

    public void printAttendanceGrades(){
        System.out.print("\t\t\t");
        for (String names: this.nameList){
            System.out.print(names+"\t\t");
        }
        System.out.println();
        System.out.println("__________________________________________________________________");
        for (int i=0;i<this.labSubjects.length;i++){
            System.out.print(this.labSubjects[i]+"\t|\t");
            for (int j=0;j<this.nameList.length;j++){
                System.out.print(labGrades[i][j]+"\t\t\t");
            }
            System.out.println();
            System.out.print(daysOfWeek[i]+"\t\t\t");
            for (int j=0;j<this.nameList.length;j++){
                if(weeklyCheckList[i][j]==0){
                    System.out.print("Absent\t\t");
                }
                else {
                    System.out.print("Presnt\t\t");
                }
            }
            System.out.println();
            System.out.println("**********");
        }
    }
}
