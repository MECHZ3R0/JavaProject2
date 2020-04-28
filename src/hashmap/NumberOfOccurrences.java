package hashmap;

import java.util.HashMap;

public class NumberOfOccurrences {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,2,2};
        fornumbers(arr);
        String word="Java";
        forletters(word);
    }
    public static void fornumbers(int[] arr){
        HashMap<Integer,Integer> occurrences=new HashMap<>();
        for (int i:arr){
            if (!occurrences.containsKey(i)){
                occurrences.put(i,1);
            }
            else {
                occurrences.put(i,occurrences.get(i)+1);
            }
        }
        System.out.println(occurrences);
    }
    public static void forletters(String word){
        HashMap<Character,Integer> occurrences=new HashMap<>();
        for (int i=0; i<word.length();i++){
            if (!occurrences.containsKey(word.charAt(i))){
                occurrences.put(word.charAt(i),1);
            }
            else {
                occurrences.put(word.charAt(i),occurrences.get(word.charAt(i))+1);
            }
        }
        System.out.println(occurrences);
    }
}
