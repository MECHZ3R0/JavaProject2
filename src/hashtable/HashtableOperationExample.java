package hashtable;

import java.util.Hashtable;
import java.util.Iterator;

public class HashtableOperationExample {
    public static void main(String[] args) {
        Hashtable<Integer,Integer> ht=new Hashtable<>();
        for (int i=0;i<11;i++){
            ht.put(i,i*2);
        }
        System.out.println(ht);
        Iterator<Integer> itr=ht.keySet().iterator();
        while(itr.hasNext()){
            if (itr.next()>7){
                ht.remove(itr.next());  //--> will throw ConcurrentModificationException error
            }
        }
        System.out.println(ht);
    }
}
