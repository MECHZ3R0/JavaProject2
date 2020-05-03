package stringbuilder;

import java.util.HashSet;

public class Win {
    public static void main(String[] args) {
        String[] arr = {"@","@","@","@"};
        System.out.println(isWin(arr));
    }
    public static boolean isWin(String[] arr){
        HashSet<String> hs =new HashSet<>();
        for (String s:arr){
            hs.add(s);
        }
        return hs.size()==1?true:false;
    }
}
