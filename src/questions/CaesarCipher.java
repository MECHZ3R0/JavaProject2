package questions;

import java.util.Hashtable;

public class CaesarCipher {
    public static void main(String[] args) {
        String str="az";
        int cipher=3;
        System.out.println(cipher(str,cipher));
        System.out.println(cipher(str));
    }
    public static String cipher(String str, int cipher){
        Hashtable<Character,Character> ht=new Hashtable<>();
        String result="";
        for (char i='a';i<='z';i++){
            if (i+cipher<='z') {
                ht.put(i, (char) (i + cipher));
            }
            else {
                ht.put(i, (char) ('a'-1+cipher-('z'-i)));
            }
        }
        for (int i=0;i<str.length();i++){
            result+=ht.get(str.charAt(i));
        }
        return result;
    }
    public static String cipher(String str){
        String standardString="abcdefghijklmnopqrstuvwxyz";
        String cipherString="defghijklmnopqrstuvwxyzabc";
        String result="";
        for (int i=0;i<str.length();i++){
            result+=cipherString.charAt(standardString.indexOf(str.charAt(i)));
        }
        return result;
    }
}
