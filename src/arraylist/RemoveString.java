package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveString {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>(Arrays.asList("abc","sdf","fgh","ert"));
        remwithbool(arr);
        remwitharray(arr);
    }
    public static void remwithbool(ArrayList<String> arr){
        ArrayList<String> remarr=new ArrayList<>();
        for (int i=0;i<arr.size();i++){
            boolean x=true;
            for (int j=0;j<arr.get(i).length();j++){
                if ((arr.get(i).charAt(j)=='a')||(arr.get(i).charAt(j)=='e')||(arr.get(i).charAt(j)=='e')){
                    x=false;
                }
            }
            if(x){
                remarr.add(arr.get(i));
            }
        }
        System.out.println(remarr);
    }
    public static void remwitharray(ArrayList<String> arr){
        ArrayList<String> remarr=new ArrayList<>();
        for (String word:arr){
            if (!(word.contains("a")||word.contains("e")||word.contains("i"))){
                remarr.add(word);
            }
        }
        System.out.println(remarr);
    }
}
