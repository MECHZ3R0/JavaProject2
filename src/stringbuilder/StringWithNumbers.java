package stringbuilder;

public class StringWithNumbers {
    public static void main(String[] args) {
        String str = "1234";
        System.out.println(isNumber(str));

    }
    public static boolean isNumber(String str){
        StringBuilder strb=new StringBuilder(str);
        boolean x = true;
        for (int i=0;i<strb.length();i++){
            if (!((strb.charAt(i)>='0'&&strb.charAt(i)<='9'))){
                x=false;
            }
        }
        return x;
    }
}
