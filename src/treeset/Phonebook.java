package treeset;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Phonebook {
    public static void main(String[] args) {
        TreeSet<String> ts=new TreeSet<>(Arrays.asList("Delta: 456","Alpha: 123","Beta: 234","Gamma: 345"));
        Iterator<String> itr=ts.iterator();
        while(itr.hasNext()){
            String data=itr.next();
            System.out.println(data);
        }
    }
}
