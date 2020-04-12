package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> strlist=new ArrayList<>(Arrays.asList("a","b","c","d","e"));
        String[] str=new String[strlist.size()];
        for (int i=0;i<str.length;i++){
            str[i]=strlist.get(i);
        }
        for (String strings:str){
            System.out.print(strings+", ");
        }
    }
}
