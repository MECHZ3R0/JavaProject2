package questions;

public class MakeAbbA {
    public static void main(String[] args) {
        String str1="a";
        String str2="b";
        System.out.println(makeAbbA(str1,str2));
    }
    public static String makeAbbA(String str1,String str2){
        return str1+str2+str2+str1;
    }
}
