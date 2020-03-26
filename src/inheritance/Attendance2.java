package inheritance;

import java.util.Arrays;

public class Attendance2 {
    private String[] nameList;
    private int[] idList;
    private int[][] weeklyCheckList;
    final String[] daysOfWeek={"Mon","Tue","Wed","Thu","Fri"};

    public Attendance2(String[] nameList, int[] idList) {
        this.nameList = nameList;
        this.idList = idList;
        this.weeklyCheckList=new int[5][nameList.length];
    }
    public void enterAttendanceToday(String today){
        if(today.equalsIgnoreCase("Mon")){
            for (int i=0;i<this.nameList.length;i++){
                this.weeklyCheckList[0][i]=1;
            }
        }
        else if(today.equalsIgnoreCase("Tue")){
            for (int i=0;i<this.nameList.length;i++){
                this.weeklyCheckList[1][i]=1;
            }
        }
    }
    public void printWeeklyAttendance(){
        System.out.print("\t\t");
        for (String names: this.nameList){
            System.out.print(names+"\t\t");
        }
        System.out.println();
        System.out.println("__________________________________________________________________");
        for (int i=0;i<this.daysOfWeek.length;i++){
            System.out.print(this.daysOfWeek[i]+"\t|\t");
            for (int j=0;j<this.nameList.length;j++){
                if (this.weeklyCheckList[i][j]==0){
                    System.out.print("Absent\t\t");
                }
                else {
                    System.out.print("Present\t\t");
                }
            }
            System.out.println();
        }
    }

    private int[] findMax(int[] total){
        int[] results = {0,0};
        int value=total[0];
        int index=0;
        for (int i=0;i<total.length;i++){
            if (value<total[i]){
                value=total[i];
                index=i;
            }
        }
        results[0]=value;
        results[1]=index;
        return  results;
    }

    public void findTheMostAttendance(){
        int[] totalAttendance=new int[nameList.length];
        for (int i=0;i<nameList.length;i++){
            int total=0;
            for (int j=0;j<daysOfWeek.length;j++){
                total+=weeklyCheckList[j][i];
            }
            totalAttendance[i]=total;
        }
        int[] results=findMax(totalAttendance);
        System.out.println("The Most Attended is "+nameList[results[1]]+" with "+results[0]+" day(s).");
    }

    public void findTheMostAttendedDay(){
        int[] totalDays=new int[daysOfWeek.length];
        for (int i=0;i<daysOfWeek.length;i++){
            int total=0;
            for (int j=0;j<nameList.length;j++){
                total+=weeklyCheckList[i][j];
            }
            totalDays[i]=total;
        }
        int[] results=findMax(totalDays);
        System.out.println("The Most Attended Day is "+daysOfWeek[results[1]]+" with "+results[0]+" people.");
    }

    @Override
    public String toString() {
        return "Attendance2{" +
                "nameList=" + Arrays.toString(nameList) +
                ", idList=" + Arrays.toString(idList) +
                ", weeklyCheckList=" + Arrays.toString(weeklyCheckList) +
                ", daysOfWeek=" + Arrays.toString(daysOfWeek) +
                '}';
    }
}
