package linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListwithLength {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<>(Arrays.asList("Hi", "Hello", "Hey", "Good", "morning"));
        String temp=linkedList.get(0);
        for (String word:linkedList){
            if (temp.length()<word.length()){
                temp=word;
            }
        }
        System.out.println("The big word is: "+temp);
        for (String word:linkedList){
            if (temp.length()>word.length()){
                temp=word;
            }
        }
        System.out.println("The small word is: "+temp);
    }
}
