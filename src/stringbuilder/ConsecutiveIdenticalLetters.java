package stringbuilder;

public class ConsecutiveIdenticalLetters {
    public static void main(String[] args) {
        System.out.println(doubleLetters("loop"));
    }
    public static boolean doubleLetters(String str){
        boolean x=false;
        for (int i=0;i<str.length()-1;i++){
            if (str.charAt(i)==str.charAt(i+1)){
                x = true;
            }
        }
        return x;
    }
}
