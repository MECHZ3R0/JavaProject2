package review;

public class PlannerClass {
    String plannerName;
    String[][] dateANDevent;

    public PlannerClass() {
        int totalNumberOfEvents=dateANDevent.length;
    }

    public PlannerClass(String plannerName, String[][] dateANDevent) {
        this.plannerName = plannerName;
        this.dateANDevent = dateANDevent;
    }

    void addEvent(String date, String event){
        String[][] tempArray = new String[dateANDevent.length+1][2];
        for (int i=0;i<dateANDevent.length;i++){
            tempArray[i][0]=dateANDevent[i][0];
            tempArray[i][1]=dateANDevent[i][1];
        }
        tempArray[dateANDevent.length][0]=date;
        tempArray[dateANDevent.length][1]=event;
        dateANDevent=tempArray;
    }

    void deleteEvent(String event){
        String[][] tempArray = new String[dateANDevent.length-1][2];
        for (int i=0,j=0; i<dateANDevent.length;i++){
            if (!dateANDevent[i][1].equalsIgnoreCase(event)){
                tempArray[j][0]=dateANDevent[i][0];
                tempArray[j][1]=dateANDevent[i][1];
                j++;
            }
        }
        dateANDevent=tempArray;
    }
    void printEvent(){
        for (int i=0;i<dateANDevent.length;i++){
            System.out.println(dateANDevent[i][0]+"\t | \t"+dateANDevent[i][1]);
        }
        System.out.println("--------------------------------");
    }
}
