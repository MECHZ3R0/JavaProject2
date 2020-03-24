package inheritance;

public class Attendance {
    protected String[] nameList;
    protected int[] idList;

    public Attendance(String[] nameList, int[] idList) {
        this.nameList = nameList;
        this.idList = idList;
    }

    public static String[][][][] checkList(String[] names, String[] attendance){
        String[] weeklyCheckList={"1","2","3","4"};;
        String[] daysOfWeek={"Monday","Tuesday","Wednesday","Thursday","Friday"};
        String[][][][] table=new String[weeklyCheckList.length][daysOfWeek.length][names.length][2];
        for (int i=0;i<weeklyCheckList.length;i++){
            for (int j=0;j<daysOfWeek.length;j++){
                for (int k=0;k<names.length;k++) {
                    table[i][j][k][0] = names[k];
                    table[i][j][k][1] = attendance[k];
                    table[i][j][0][0]=daysOfWeek[j];
                    table[i][0][0][0]=weeklyCheckList[i];
                }
            }
        }
        return table;
    }
    public String[][][][] enterAttendance(){
        String[] attendance = {"1","0","1","0","1"};
        return checkList(this.nameList,attendance);
    }

    public void printAttendance(String[][][][] table){
        for(int i=0; i<table.length;i++){
            System.out.println(table[i][0][0][0]);
            for(int j=0;j<table[i].length;j++){
                System.out.println(table[i][j][0][0]);
                for(int k=0;k<table[i][j].length;k++){
                    System.out.println(table[i][j][k][0]);
                    for(int t=0;t<table[i][j][k].length;t++){
                        System.out.println(table[i][j][k][t]);
                    }
                }
            }
        }
    }
}
