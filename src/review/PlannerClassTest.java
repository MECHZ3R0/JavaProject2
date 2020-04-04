package review;

public class PlannerClassTest {
    public static void main(String[] args) {
        String [][] inputEvent = {{"January","Football"},{"Februar","Basketball"},{"March","Baseball"}};
        String[] inputCheckList = {"Amazing    ", "Cool", "Awesome"};
        PlannerClass x =new PlannerClass("Sports",inputEvent);
        x.printEvent();
        x.addEvent("April","Tennis");
        x.printEvent();
        x.deleteEvent("Baseball");
        x.deleteEvent("Basketball");
        x.printEvent();

        ExpoPlanner y=new ExpoPlanner("Sports", inputEvent, "Game",inputCheckList);
        y.addEvent("May    ","E-Sports");
        y.printEventsANDCheckLists();
    }
}
