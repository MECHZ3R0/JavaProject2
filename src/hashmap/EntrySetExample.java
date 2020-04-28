package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EntrySetExample {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        hm.put("A","B");
        hm.put("C","D");
        System.out.println(hm);
        System.out.println(hm.entrySet());
        Iterator itr=hm.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry mapItem=(Map.Entry)itr.next();
            System.out.println(mapItem.getKey()+" = "+mapItem.getValue());
        }
    }
}
