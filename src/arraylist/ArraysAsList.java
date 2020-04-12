package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysAsList {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        arrlist.add(4);
        arrlist.add(10);
        arrlist.add(50);
        for (int i=0;i<arrlist.size();i++){
            System.out.print(arrlist.get(i)+"\t");
        }
        System.out.println();
        arrlist.remove(0);
        for (int i=0;i<arrlist.size();i++){
            System.out.print(arrlist.get(i)+"\t");
        }
        System.out.println();
        arrlist.clear();
        for (int i=0;i<arrlist.size();i++){
            System.out.print(arrlist.get(i)+"\t");
        }
    }
}
