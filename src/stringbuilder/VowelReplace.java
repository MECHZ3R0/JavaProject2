package stringbuilder;

public class VowelReplace {
    public static void main(String[] args) {
        System.out.println(vreplace("banana","e"));
        System.out.println(vreplace("banana",'e'));
    }
    public static StringBuilder vreplace(String str, String repl){
        StringBuilder sb =new StringBuilder(str);
        String vowels="aeoui";
        for (int i = 0; i < sb.length(); i++) {
            if(vowels.contains(""+sb.charAt(i))){
                sb.replace(i,i+1,repl);
            }
        }
        return sb;
    }
    public static String vreplace(String str, char repl) {
        return str.replaceAll("[aeoui]", "" + repl);
    }
}
