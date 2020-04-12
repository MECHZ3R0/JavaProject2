package arraylist;

import java.util.ArrayList;

public class StringtoCharArrayList {
    public static void main(String[] args) {
        String str = "Java is Fun";
        ArrayList<Character> arrchar=new ArrayList<>();
        for (int i=0;i<str.length();i++){
            arrchar.add(str.charAt(i));
        }
        System.out.println(arrchar);
    }
}
