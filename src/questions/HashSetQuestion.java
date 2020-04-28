package questions;

import java.util.HashSet;

public class HashSetQuestion {
    public static void main(String[] args) {
        int t=5;
        String[] pair_left = {"alpha", "gamma", "alpha","theta","theta"};
        String[] pair_right = {"beta","delta","beta","omega","omega"};
        HashSet<String> hs= new HashSet<>();
        for (int i=0;i<t;i++){
            hs.add(pair_left[i]+" "+pair_right[i]);
            System.out.println(hs.size());
        }
    }
}
