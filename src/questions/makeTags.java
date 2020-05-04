package questions;

public class makeTags {
    public static void main(String[] args) {
        makeTags("i","Hello");
    }
    public static void makeTags(String tag, String word){
        System.out.println("<"+tag+">"+word+"<"+tag+"/>");
    }
}
