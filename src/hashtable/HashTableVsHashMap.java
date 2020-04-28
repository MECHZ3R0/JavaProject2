package hashtable;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableVsHashMap {
    public static void main(String[] args) {
        Hashtable<String,String> ht=new Hashtable<>();
        HashMap<String,String> hm=new HashMap<>();

        hm.put(null,"one");     //--> hashmap allows only one null key
        hm.put("two",null);
        hm.put("three",null);   //--> hashmap allows multiple null values
        System.out.println(hm);

//        ht.put(null,"one");
//        ht.put("two",null);
//        ht.put("three",null);    --> hashtable does not allow either null key or null values
//        System.out.println(ht);
    }
}
