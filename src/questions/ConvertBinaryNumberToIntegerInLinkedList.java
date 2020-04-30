package questions;

import java.util.Arrays;
import java.util.LinkedList;

public class ConvertBinaryNumberToIntegerInLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList<>(Arrays.asList(1,0,1));
        System.out.println(converter(arr));
    }
    public static int converter(LinkedList<Integer> arr){
        int result = 0;
        for (int i=0;i<arr.size();i++){
            result+=arr.get(i)*(Math.pow(2,i));
        }
        return result;
    }
}
