package stringbuilder;

public class SimilarStart {
    public static void main(String[] args) {
        String str1="javar";
        String str2="va";
        System.out.println(similarStart(str1,str2));
    }
    public static boolean similarStart(String str1, String str2){
        if (str1.substring(str1.length()-str2.length(),str1.length()).equalsIgnoreCase(str2)){
            return true;
        }
        else {
            return false;
        }
    }
}
