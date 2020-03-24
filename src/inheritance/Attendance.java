package inheritance;

public class Attendance {
    protected String[] nameList;
    protected int[] idList;

    public Attendance(String[] nameList, int[] idList) {
        this.nameList = nameList;
        this.idList = idList;
    }

    public static String[][][][] checkList(String[] names, String[] attendance){
        String[] weeklyCheckList={"","Week1","Week2","Week3","Week4"};;
        String[] daysOfWeek={"","Monday","Tuesday","Wednesday","Thursday","Friday"};
        String[][][][] table=new String[weeklyCheckList.length][daysOfWeek.length][names.length][2];
        for (int i=1;i<weeklyCheckList.length;i++){
            table[i][0][0][0]=weeklyCheckList[i];
            for (int j=1;j<daysOfWeek.length;j++){
                table[0][j][0][0]=daysOfWeek[j];
                for (int k=1;k<names.length;k++) {
                    table[i][j][k][0] = names[k];
                    table[i][j][k][1] = attendance[k];
                }
            }
        }
        return table;
    }
    public String[][][][] enterAttendance(){
        String[] attendance = {"","1","0","1","0","1"};
        return checkList(this.nameList,attendance);
    }

    public void printWeeklyAttendance(String[][][][] table){
        for(int i=1; i<table.length;i++){
            System.out.println(table[i][0][0][0]+": ");
            for(int j=1;j<table[i].length;j++){
                System.out.println("\t"+table[0][j][0][0]+": ");
                for(int k=1;k<table[i][j].length;k++){
                    System.out.print("\t\t"+table[i][j][k][0]+": ");
                    System.out.println(table[i][j][k][1]);
                }
                System.out.println("+++++++++++++++++++++++++");
            }
            System.out.println();
            System.out.println("*****************************");
            System.out.println();
        }
    }

    public void printMostAttendedPerson(String[][][][] table){
        int siri=0;
        int alexa=0;
        int cortana=0;
        int google=0;
        int bixby=0;
        for(int i=1; i<table.length;i++) {
            for (int j = 1; j < table[i].length; j++) {
                for (int k = 1; k < table[i][j].length; k++) {
                    if(table[i][j][k][0].equalsIgnoreCase("Siri")){
                        if (table[i][j][k][1].equalsIgnoreCase("1")){
                            siri++;
                        }
                    }
                    if(table[i][j][k][0].equalsIgnoreCase("Alexa")){
                        if (table[i][j][k][1].equalsIgnoreCase("1")){
                            alexa++;
                        }
                    }
                    if(table[i][j][k][0].equalsIgnoreCase("Cortana")){
                        if (table[i][j][k][1].equalsIgnoreCase("1")){
                            cortana++;
                        }
                    }
                    if(table[i][j][k][0].equalsIgnoreCase("Google")){
                        if (table[i][j][k][1].equalsIgnoreCase("1")){
                            google++;
                        }
                    }
                    if(table[i][j][k][0].equalsIgnoreCase("Bixby")){
                        if (table[i][j][k][1].equalsIgnoreCase("1")){
                            bixby++;
                        }
                    }
                }
            }
        }

        if (siri>alexa&&siri>cortana&&siri>google&&siri>bixby){
            System.out.println("The most attended person is Siri");
        }
        else if (siri<alexa&&alexa>cortana&&alexa>google&&alexa>bixby){
            System.out.println("The most attended person is Alexa");
        }
        else if (siri<cortana&&alexa<cortana&&cortana>google&&cortana>bixby){
            System.out.println("The most attended person is Cortana");
        }
        else if (siri<google&&alexa<google&&cortana<google&&google>bixby){
            System.out.println("The most attended person is Cortana");
        }
        else if (siri<bixby&&alexa<bixby&&cortana<bixby&&google<bixby){
            System.out.println("The most attended person is Bixby");
        }
        else {
            System.out.println("Everybody's attendance is equal");
        }
        System.out.println("--------------------------------\n");
    }

    public void printMostAttndedDay(String[][][][] table){
        int monday=0;
        int tuesday=0;
        int wednesday=0;
        int thursday=0;
        int friday=0;
        for(int i=1; i<table.length;i++) {
            for (int j = 1; j < table[i].length; j++){
                if(table[0][j][0][0].equalsIgnoreCase("Monday")) {
                    for (int k = 1; k < table[i][j].length; k++) {
                        if (table[i][j][k][1].equalsIgnoreCase("1")) {
                            monday++;
                        }
                    }
                }
                if(table[0][j][0][0].equalsIgnoreCase("Tuesday")){
                    for (int k = 1; k < table[i][j].length; k++) {
                        if (table[i][j][k][1].equalsIgnoreCase("1")){
                            tuesday++;
                        }
                    }
                }
                if(table[0][j][0][0].equalsIgnoreCase("Wednesday")) {
                    for (int k = 1; k < table[i][j].length; k++) {
                        if (table[i][j][k][1].equalsIgnoreCase("1")) {
                            wednesday++;
                        }
                    }
                }
                if(table[0][j][0][0].equalsIgnoreCase("Thursday")) {
                    for (int k = 1; k < table[i][j].length; k++) {
                        if (table[i][j][k][1].equalsIgnoreCase("1")) {
                            thursday++;
                        }
                    }
                }
                if(table[0][j][0][0].equalsIgnoreCase("Friday")) {
                    for (int k = 1; k < table[i][j].length; k++) {
                        if (table[i][j][k][1].equalsIgnoreCase("1")) {
                            friday++;
                        }
                    }
                }
            }
        }
        if (monday>tuesday&&monday>wednesday&&monday>thursday&&monday>friday){
            System.out.println("The most attended day is Monday");
        }
        else if (monday<tuesday&&tuesday>wednesday&&tuesday>thursday&&tuesday>friday){
            System.out.println("The most attended day is Tuesday");
        }
        else if (monday<wednesday&&tuesday<wednesday&&wednesday>thursday&&wednesday>friday){
            System.out.println("The most attended day is Wednesday");
        }
        else if (monday<thursday&&tuesday<thursday&&wednesday<thursday&&thursday>friday){
            System.out.println("The most attended day is Thursday");
        }
        else if (monday<friday&&tuesday<friday&&wednesday<friday&&thursday<friday){
            System.out.println("The most attended friday is Friday");
        }
        else {
            System.out.println("Everyday's attendance is equal");
        }
        System.out.println("-----------------------------\n");
    }
}
