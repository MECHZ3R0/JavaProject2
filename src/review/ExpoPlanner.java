package review;

public class ExpoPlanner extends PlannerClass {
    String expoName;
    String[] checkList;

    public ExpoPlanner(String plannerName, String[][] dateANDevent, String expoName, String[] checkList) {
        super(plannerName, dateANDevent);
        this.expoName = expoName;
        this.checkList = checkList;
        int totalCheckListItems=this.checkList.length;
    }

    void printEventsANDCheckLists(){
        String[][] checkListSum= new String[dateANDevent.length][checkList.length];
        for (int i=0; i<dateANDevent.length;i++){
            checkListSum[i]=checkList;
        }
        for (int i=0; i<dateANDevent.length;i++){
            System.out.print(dateANDevent[i][0]+"\t | \t"+dateANDevent[i][1]+"\t\t");
            for (int j=0; j<checkList.length;j++){
                System.out.print(checkListSum[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
