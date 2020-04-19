package arraylist2d;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplyWithWindow {
    public static void main(String[] args) {
        int[] window = {1,2};
        ArrayList<ArrayList<Integer>>arr=new ArrayList<>();
        arr.add(new ArrayList<>());
        arr.get(0).addAll(Arrays.asList(1,2,3,4,5));
        arr.add(new ArrayList<>());
        arr.get(1).addAll(Arrays.asList(6,7,8,9,10));
        System.out.println(arr);
        applyWindowing(window,arr);

    }
    public static void applyWindowing(int[] window, ArrayList<ArrayList<Integer>> arr){
        int number=0;
        for (int i=0;i<arr.size();i++){
            for (int j=0;j<arr.get(i).size()-1;j+=2){
                number=arr.get(i).get(j)*window[0];
                arr.get(i).set(j,number);
                number=arr.get(i).get(j+1)*window[1];
                arr.get(i).set(j+1,number);
            }
        }
        System.out.println(arr);
    }
}
