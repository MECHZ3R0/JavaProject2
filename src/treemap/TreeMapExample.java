package treemap;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        //natural ordering by default
        TreeMap<Integer,String> tm=new TreeMap<>();
        tm.put(2,"B");
        tm.put(1,"A");
        tm.put(3,"C");

        System.out.println(tm.get(3));  //get the value for key 3 and print it
        System.out.println(tm.getOrDefault(5,"oops"));  //get the value for key 5 and print it, but if it does not exist then use "oops" for the value.

        Iterator<Integer> itr = tm.keySet().iterator();
        while (itr.hasNext()){
            int key=itr.next();
            System.out.println("Key: "+key+"   Value: "+tm.get(key));
        }

        tm.remove(3);
        System.out.println(tm);

        System.out.println(tm.containsKey(1));  //boolean checks if treemap contains key 1
        System.out.println(tm.containsValue("B"));  //boolean checks if treemap contains value "B"
        System.out.println(tm.ceilingKey(2));
    }
}
