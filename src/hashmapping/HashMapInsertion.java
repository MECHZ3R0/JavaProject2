package hashmapping;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class HashMapInsertion {
    public static void main(String[] args) {
        HashMap<Character,Character> hm = new HashMap<>(10);
        String a = "abgskhabb";
        char x;
        for (int i = 0; i < a.length() ; i++) {
            x=a.charAt(i);
            x++;
            hm.put(a.charAt(i),x);
        }
        Iterator hmIterator = hm.entrySet().iterator();
        while (hmIterator.hasNext()){
            Map.Entry mapElement = (Map.Entry)hmIterator.next();
            System.out.println(mapElement.getKey()+"="+mapElement.getValue());
        }
    }
}
