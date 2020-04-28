package treeset;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> ts=new TreeSet<>();
        //add elements to TreeSet
        ts.add("Z");   //--> values will be auto sorted in TreeSet
        ts.add("T");
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("D");
        ts.add("E");
        ts.add("C");
        ts.add("D");
        ts.add("A");
        ts.add("C");     //--> duplicates will not be added to TreeSet
        //ts.add(null);    --> null is not allowed in TreeSet
        System.out.println(ts);
        //check if element exists
        boolean found = ts.contains("A");   //true
        System.out.println(found);
        //remove element
        ts.remove("D");
        //iterate over values
        Iterator<String> itr=ts.iterator();
        while(itr.hasNext()){
            String value=itr.next();
            System.out.println("Value: "+value);
        }
    }
}
