package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i=0;i<=1000;i++){
            list.add(i);
        }
        for (int i=0;i<=1000;i++){
            System.out.println(list.get(i));
        }

    }
}
