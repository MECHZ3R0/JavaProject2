package questions;

public class RepeatSeparator {
    public static void main(String[] args) {
        repeatSeparator("Word","X",1);
    }
    public static void repeatSeparator(String str1,String str2,int repeat){
        for (int i = 0; i < repeat-1; i++) {
            System.out.print(str1);
            System.out.print(str2);
        }
        System.out.print(str1);
    }
}
