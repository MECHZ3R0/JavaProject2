package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class RepeatingWordsInSentence {
    public static void main(String[] args) {
        String sample="The best way to understand java is the practice java using java";
        sample=sample.toLowerCase();
        ArrayList<String> arr=new ArrayList<>();
        String word="";
        for (int i=0;i<sample.length();i++){
            if (sample.charAt(i)!=' '){
                word+=sample.charAt(i);
            }
            else{
                arr.add(word);
                word="";
            }
        }
        arr.add(word);
        HashMap<String,Integer> occurrences=new HashMap<>();
        for (int i=0; i<arr.size();i++){
            if (!occurrences.containsKey(arr.get(i))){
                occurrences.put(arr.get(i),1);
            }
            else {
                occurrences.put(arr.get(i),occurrences.get(arr.get(i))+1);
            }
        }
        System.out.println(occurrences);
    }
}
