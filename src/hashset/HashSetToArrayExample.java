package hashset;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetToArrayExample {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("E");
        System.out.println(hs);
        String[] values=new String[hs.size()];
        hs.toArray(values);
        System.out.println(Arrays.toString(values));
    }
}
