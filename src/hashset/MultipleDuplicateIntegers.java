package hashset;

import java.util.HashSet;

public class MultipleDuplicateIntegers {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(hasUniqueNumbers(n));
    }
    public static boolean hasUniqueNumbers(int n){
        HashSet<Character> hs=new HashSet<>();
        String str=""+n;
        boolean result=true;
        for(int i=0;i<str.length();i++){
            if(!hs.add(str.charAt(i))){
                result = false;
                break;
            }
        }
        return result;
    }
}
