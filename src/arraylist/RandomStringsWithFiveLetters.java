package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class RandomStringsWithFiveLetters {
    public static void main(String[] args) {
        ArrayList<Character> arrchar=new ArrayList<>();
        ArrayList<String> arrstr=new ArrayList<>();
        Random rnd=new Random();
        for (int j=0;j<100;j++){
            for (int i=0;i<5;i++){
                arrchar.add((char)(97+Math.abs(rnd.nextInt(26))));
            }
            arrstr.add(arrchar.toString());
            arrchar.clear();
        }
        System.out.println(arrstr);
    }
}
