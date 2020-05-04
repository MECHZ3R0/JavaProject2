package questions;

public class RedOrBlue {
    public static void main(String[] args) {
        seeColor("redxx");
        seeColor("xxred");
        seeColor("bluexx");
    }
    public static void seeColor(String str){
            if (str.substring(0,3).equals("red")){
                System.out.println("red");
            }
            else if (str.substring(0,4).equals("blue")){
                System.out.println("blue");
            }
            else{
                System.out.println("\"\"");
            }
    }
}
