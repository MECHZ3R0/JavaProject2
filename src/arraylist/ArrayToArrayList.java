package arraylist;

import java.util.ArrayList;

public class ArrayToArrayList {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> arrlist=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            arrlist.add(arr[i]);
        }
        System.out.println(arrlist);
    }
}
