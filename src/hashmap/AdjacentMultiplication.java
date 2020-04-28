package hashmap;

import java.util.HashMap;

public class AdjacentMultiplication {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,2,5};
        HashMap<Integer,Integer> mult=new HashMap<>();
        for(int i=0;i<arr.length-1;i++){
            mult.put(i,arr[i]*arr[i+1]);
        }
        int big=0;
        int key=0;
        for (Integer i: mult.keySet()){
            if (big<mult.get(i)){
                big=mult.get(i);
                key=i;
            }
        }
        System.out.println("Index "+key+" value "+arr[key]);
        System.out.println("Index "+(key+1)+" value "+arr[key+1]);
        System.out.println("Multiplication: "+mult.get(key));
    }
}
