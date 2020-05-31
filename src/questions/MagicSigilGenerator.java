package questions;

import java.util.HashSet;
//Magic Sigil Generator
//https://edabit.com/challenge/6mLZjPrNFrfGfdwqa
public class MagicSigilGenerator {
    public static void main(String[] args) {
        sigilize("I HAVE WONDERFUL FRIENDS WHO LOVE ME");
        sigilize("i am healthy");
        sigilize("I FOUND MY SOULMATE");
        sigilize("I have a job I enjoy and it pays well");
    }
    public static void sigilize(String rawSigil){
        String sigil = rawSigil.toUpperCase();
        String newSigil = duplicates(sigil);
        String newestSigil = vowels(newSigil);
        System.out.println(newestSigil);
    }
    public static String duplicates(String sigil){
        HashSet<Character> chars = new HashSet<>();
        StringBuilder revSigil=new StringBuilder();
        for (int i = sigil.length()-1; i >= 0 ; i--) {
            if(chars.add(sigil.charAt(i))&&sigil.charAt(i)!=' '){
                revSigil.append(sigil.charAt(i));
            }
        }
        String newSigil=revSigil.reverse().toString();
        return newSigil;
    }
    public static String vowels(String newSigil){
        String newestSigil="";
        for (int i = 0; i < newSigil.length(); i++) {
            if(!(newSigil.charAt(i)=='A'|newSigil.charAt(i)=='E'|newSigil.charAt(i)=='O'|newSigil.charAt(i)=='U'|newSigil.charAt(i)=='I')){
                newestSigil+=newSigil.charAt(i);
            }
        }
        return newestSigil;
    }
}
