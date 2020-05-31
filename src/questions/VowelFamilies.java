package questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
//Vowel Families
//https://edabit.com/challenge/9P6yDuSZxYTihMtT6
public class VowelFamilies {
    public static void main(String[] args) {
        sameVowelGroup("toe","ocelot","sheep");
        System.out.println("-----------");
        sameVowelGroup("many","carriage","emit","apricot","animal");
        System.out.println("-----------");
        sameVowelGroup("hoops","chuff","bot","bottom");
    }
    public static void sameVowelGroup(String... words){
        char[] vowelChars = vowelChars(words[0]);
        System.out.println(words[0]);
        for (int i = 1; i < words.length; i++) {
            if(Arrays.equals(vowelChars,vowelChars(words[i]))){
                System.out.println(words[i]);
            }
        }
    }
    public static char[] vowelChars(String words){
        HashSet<Character> vowelChars = new HashSet<>();
        for (int i = 0; i < words.length(); i++) {
            if(words.charAt(i)=='a'|words.charAt(i)=='e'|words.charAt(i)=='o'|words.charAt(i)=='u'|words.charAt(i)=='i'|words.charAt(i)=='y'){
                vowelChars.add(words.charAt(i));
            }
        }
        Iterator<Character> itr = vowelChars.iterator();
        char temp;
        int i=0;
        char[] chars = new char[vowelChars.size()];
        while (itr.hasNext()){
            temp=itr.next();
            chars[i]=temp;
            i++;
        }
        return chars;
    }
}
