package stringbuilder;

public class WordCountCamelCase {
    public static void main(String[] args) {
        System.out.println(wordCount("saveChangesInTheEditor"));
    }
    public static int wordCount(String str){
        int x=1;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                x++;
            }
        }
        return x;
    }
    public static int wordCount(String str,boolean b){
        int x=1;
        for (int i=0;i<str.length();i++){
            if (Character.isUpperCase(str.charAt(i))){
                x++;
            }
        }
        return x;
    }
    public static long wordCount(String str,boolean b, boolean l){
        return str.codePoints().filter(c-> Character.isUpperCase(c)).count()+1;
    }
}
