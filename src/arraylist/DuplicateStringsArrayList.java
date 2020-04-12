package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateStringsArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrlist=new ArrayList<>(Arrays.asList("Mercury","Venus","Venus","Earth","Mercury","Mars","Venus"));
        ArrayList<String> emptyarrlist=new ArrayList<>();
        for(String strings: arrlist){
            if (!emptyarrlist.contains(strings)){
                emptyarrlist.add(strings);
            }
        }
        System.out.println(emptyarrlist);
    }
}
