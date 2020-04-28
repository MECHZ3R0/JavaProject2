package hashmapping;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i=1;i<100;i+=2){
            arr.add(i);
        }
        Iterator<Integer> itr=arr.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
