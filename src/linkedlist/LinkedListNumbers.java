package linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListNumbers {
    public static void main(String[] args) {
        LinkedList<String> arrLlist=new LinkedList<>(Arrays.asList("Banana 6", "Apple 8"));
        System.out.println(findDigits(arrLlist));
    }
    public static int findDigits(LinkedList<String> arrLlist){
        int sum=0;
        for (String word:arrLlist){
            for (int i=0;i<word.length();i++){
                if (Character.isDigit(word.charAt(i))){
                    sum+=Integer.parseInt(word.charAt(i)+"");
                }
            }
        }
        return sum;
    }
}
