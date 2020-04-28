package hashtable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableExample {
    public static void main(String... args) {
        Hashtable<Integer,String> ht = new Hashtable<>();
        String numbers="zero one two three four five six seven eight nine";
        String[] numbersArray = numbers.split(" ");
        ht.put(1,"unit");
        ht.put(2,"two");
        ht.put(3,"three");
        //ht.put(null,null);     --> hashtable does not accept null key or value
        System.out.println(ht);
        for (int i=0;i<numbersArray.length;i++){
            ht.put(i,numbersArray[i]);
        }
        System.out.println(ht);

        Set<Integer> keys=ht.keySet();
        Iterator<Integer> itr=keys.iterator();
        int key;
        while(itr.hasNext()){
            key=itr.next();
            System.out.println(key+" = "+ht.get(key));
        }
    }
}
