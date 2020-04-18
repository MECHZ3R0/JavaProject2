package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ShiftLeft {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        shift(2,arr);
    }
    public static void shift(int shift, ArrayList<Integer> arr){
        for (int i=shift;i<arr.size();i++){
            System.out.print(arr.get(i)+", ");
        }
    }
}
