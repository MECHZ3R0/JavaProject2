package stringbuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class UniqueCharacterStrings {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("ABCDE","DDEB","ART","CCA","BAC"));
        uniqueCharacters(arr);
    }
    public static void uniqueCharacters(ArrayList<String> arr){
        ArrayList<String> arrstr=new ArrayList<>();
        HashSet<Character> hs=new HashSet<>();
        for (int j=0;j<arr.size();j++){
            for (int i=0;i<arr.get(j).length();i++){
                hs.add(arr.get(j).charAt(i));
            }
            if (hs.size()==arr.get(j).length()){
                arrstr.add(arr.get(j));
            }
            hs.clear();
        }
        Iterator<String> itr = arrstr.iterator();
        String s;
        while(itr.hasNext()){
            s=itr.next();
            System.out.println(s);
        }
    }
}
