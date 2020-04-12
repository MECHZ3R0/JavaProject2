package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Compare2ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> int1=new ArrayList<>(Arrays.asList(2,-5,4,-2));
        ArrayList<Integer> int2=new ArrayList<>(Arrays.asList(6,4,-5,-2));
        System.out.println(compare(int1, int2));
        System.out.println(compare(int1, int1));
    }
    public static boolean compare(ArrayList<Integer> int1, ArrayList<Integer> int2){
        boolean x=true;
        for (int i=0; i<int1.size();i++){
            if (int1.get(i)!=int2.get(i)){
                x=false;
            }
        }
        return x;
    }
}
