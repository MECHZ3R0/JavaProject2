package arraylist2d;

import java.util.ArrayList;
import java.util.Arrays;

public class UpperLowerLettersInStringArray {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> arr2d =new ArrayList<>();
        arr2d.add(new ArrayList<>(Arrays.asList("Java","is","fun")));
        arr2d.add(new ArrayList<>(Arrays.asList("Java","is","Super")));
        upperInRow(arr2d);
        System.out.println("-------");
        upperInElement(arr2d);
        System.out.println("-------");
        lowerInRow(arr2d);
        System.out.println("-------");
    }
    public static void upperInRow (ArrayList<ArrayList<String>> arr2d){
        for (int i=0;i<arr2d.size();i++){
            int count=0;
            for (int j=0;j<arr2d.get(i).size();j++){
                for (int k=0;k<arr2d.get(i).get(j).length();k++){
                    if (arr2d.get(i).get(j).charAt(k)>='A'&&arr2d.get(i).get(j).charAt(k)<='Z'){
                        count++;
                    }
                }
            }
            System.out.println("Number of Uppercase Letter in Row "+i+" is "+count);
        }
    }
    public static void upperInElement (ArrayList<ArrayList<String>> arr2d){
        int count=0;
        for (int i=0;i<arr2d.size();i++){
            for (int j=0;j<arr2d.get(i).size();j++){
                for (int k=0;k<arr2d.get(i).get(j).length();k++){
                    if (arr2d.get(i).get(j).charAt(k)>='A'&&arr2d.get(i).get(j).charAt(k)<='Z'){
                        count++;
                    }
                }
            }
        }
        System.out.println("Number of Uppercase Letter in all Elements is "+count);
    }
    public static void lowerInRow (ArrayList<ArrayList<String>> arr2d){
        for (int i=0;i<arr2d.size();i++){
            int count=0;
            for (int j=0;j<arr2d.get(i).size();j++){
                for (int k=0;k<arr2d.get(i).get(j).length();k++){
                    if (arr2d.get(i).get(j).charAt(k)>='a'&&arr2d.get(i).get(j).charAt(k)<='z'){
                        count++;
                    }
                }
            }
            System.out.println("Number of Lowercase Letter in Row "+i+" is "+count);
        }
    }
}
