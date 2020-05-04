package questions;

public class StartWord {
    public static void main(String[] args) {
        makeWord("hippo","i");
    }
    public static void makeWord(String str, String m){
        if (str.substring(1,m.length()).equals(m.substring(1,m.length()))){
            System.out.println(str.substring(0,m.length()));
        }
        else{
            System.out.println("\"\"");
        }
    }
}
