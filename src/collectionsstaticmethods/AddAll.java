package collectionsstaticmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AddAll {
    public static void main(String[] args) {
        List<String> fruits=new ArrayList<>();
        Collections.addAll(fruits,"apple","plum","banana","orange");
        //Method1:
        Iterator<String> itr=fruits.iterator();
        while (itr.hasNext()){
            String str=itr.next();
            System.out.println(str);
        }
        System.out.println("------------");
        //Method2:
        fruits.forEach(System.out::println);
    }
}
