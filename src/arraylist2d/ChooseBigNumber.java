package arraylist2d;

import java.util.ArrayList;
import java.util.Arrays;

public class ChooseBigNumber {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> arrtemp=new ArrayList<>();
        arrtemp.add(arr.get(0));
        for (int i=0;i<arr.size();i++){
            if (arrtemp.get(i)<=arr.get(i)){
                arrtemp.clear();
                for (int j=0;j<arr.size();j++){
                    arrtemp.add(arr.get(i));
                }
            }
        }
        System.out.println(arrtemp);
    }
}
