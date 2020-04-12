package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateNumbersArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist=new ArrayList<>(Arrays.asList(1,2,9,3,4,5,5,6,7,4,8,9,10,11));
        ArrayList<Integer> emptyarrlist=new ArrayList<Integer>();
        for(int i=0;i<arrlist.size();i++){
            if (!emptyarrlist.contains(arrlist.get(i))){
                emptyarrlist.add(arrlist.get(i));
            }
        }
        System.out.println(emptyarrlist);
    }
}
