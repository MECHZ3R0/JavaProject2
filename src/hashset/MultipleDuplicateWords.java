package hashset;

import java.util.HashSet;

public class MultipleDuplicateWords {
    public static void main(String[] args) {
        String str = "java is java";
        String[] arr=str.split(" ");
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        System.out.println(hs);
    }
}
