package stringbuilder;

public class ToUpperCaseMethod {
    public static void main(String[] args) {
        String str = "java";
        System.out.println(toUpperCaseMethod(str));
        System.out.println(toUpperCaseMethod(str,true));
        System.out.println(toUpperCaseMethod());

    }
    public static StringBuilder toUpperCaseMethod(String str){
        StringBuilder strbd = new StringBuilder();
        for (int i=0;i<str.length();i++){
            strbd.append((char)(str.charAt(i)-32));
        }
        return strbd;
    }
    public static StringBuilder toUpperCaseMethod(String str, boolean x){
        StringBuilder strbd = new StringBuilder(str);
        int ch;
        for (int i=0;i<str.length();i++){
            ch=str.codePointAt(i);
            ch-=32;
            strbd.setCharAt(i,(char)ch);
        }
        return strbd;
    }
    public static StringBuilder toUpperCaseMethod(){
        StringBuilder strbd = new StringBuilder("Java Is Fun");
        int ch;
        for (int i=0;i<strbd.length();i++){
            if (strbd.codePointAt(i)>='a'&&strbd.codePointAt(i)<='z') {
                ch = strbd.codePointAt(i);
                ch -= 32;
                strbd.setCharAt(i, (char) ch);
            }
            else {
                strbd.setCharAt(i,(char)strbd.codePointAt(i));
            }
        }
        return strbd;
    }
}
