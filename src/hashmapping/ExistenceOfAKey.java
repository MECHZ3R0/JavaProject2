package hashmapping;

import java.util.Arrays;
import java.util.HashMap;

public class ExistenceOfAKey {
    public static void main(String[] args) {
        System.out.println(isKeyHas('b'));
    }
    public static boolean isKeyHas(char x){
        HashMap<Character,Character> h1 =new HashMap<>();
        h1.put('a','A');
        h1.put('b','B');
        //Method1:
//        if (h1.containsKey(x)){
//            return true;
//        }
//        else {
//            return false;
//        }
        //Method2:
        boolean z = false;
        for (char i:h1.keySet()){
            if (i==x){
                z=true;
                break;
             }
        }
        return z;
    }
}
