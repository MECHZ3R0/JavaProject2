package hashset;

import java.util.HashSet;

public class MultipleDuplicateCharacters {
    public static void main(String[] args) {
        String str="abcde";
        System.out.println(hasUniqueCharacter(str));
        System.out.println(hasUniqueCharacter(str,true));
    }
    public static boolean hasUniqueCharacter(String str){
        HashSet<Character> ch=new HashSet<>();
        for(int i=0;i<str.length();i++){
            ch.add(str.charAt(i));
        }
        if (ch.size()==str.length()){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean hasUniqueCharacter(String str,boolean x){
        HashSet<Character> ch=new HashSet<>();
        boolean result =true;
        for(int i=0;i<str.length();i++){
            if (!ch.add(str.charAt(i))){   //returns true/false depending on if this function could add element
                result=false;
                break;
            }
        }
        return result;
    }
}
