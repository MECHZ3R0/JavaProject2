package treemap;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapWithComparatorExample {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm=new TreeMap<>(Collections.reverseOrder());
        tm.put("Alpha",100);
        tm.put("Delta",100);
        tm.put("Omega",100);
        tm.put("Gamma",100);
        tm.put("Beta",100);
        Iterator<String> itr=tm.keySet().iterator();
        while(itr.hasNext()){
            String key=itr.next();
            System.out.println(key+" has "+tm.get(key)+" points");
        }
    }
}
