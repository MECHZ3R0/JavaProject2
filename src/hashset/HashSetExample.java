package hashset;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(2);
        hs.add(1);
        hs.add(2);
        System.out.println(hs);  //hashset will not contain duplicate numbers; thus, it will print only [1, 2].
    }
}
