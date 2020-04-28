package hashmap;

import java.util.Arrays;

public class AnagramSort {
    public static void main(String[] args) {
        String word1="dbca";
        String word2="dabc";
        char[] ch1=word1.toCharArray();
        char[] ch2=word2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        //Method 1:
        if (Arrays.equals(ch1, ch2)){
            System.out.println("\""+word1+"\""+" and "+"\""+word2+"\""+" are anagrams");
        }
        else{
            System.out.println("\""+word1+"\""+" and "+"\""+word2+"\""+" are NOT anagrams");
        }

        //Method 2:
        boolean isAnagram = true;
        for (int i=0; i<ch1.length;i++){
            if (ch1[i]!=ch2[i]){
                isAnagram=false;
                break;
            }
        }
        if (isAnagram){
            System.out.println("\""+word1+"\""+" and "+"\""+word2+"\""+" are anagrams");
        }
        else{
            System.out.println("\""+word1+"\""+" and "+"\""+word2+"\""+" are NOT anagrams");
        }
    }
}
