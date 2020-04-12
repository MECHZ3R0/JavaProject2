package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr1=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        ArrayList<String> arr2=new ArrayList<>(Arrays.asList("ab","cd","ef","gh","ij"));
        Collections.reverse(arr1);
        Collections.reverse(arr2);
        System.out.println(arr1);
        System.out.println(arr2);

        int temp;
        int index=arr1.size()-1;
        for(int i=0;i<arr1.size()/2;i++){
            temp=arr1.get(i);
            arr1.set(i,arr1.get(index));
            arr1.set(index,temp);
            index--;
        }
        System.out.println(arr1);

        String temp2;
        index=arr2.size()-1;
        for(int i=0;i<arr2.size()/2;i++){
            temp2=arr2.get(i);
            arr2.set(i,arr2.get(index));
            arr2.set(index,temp2);
            index--;
        }
        System.out.println(arr2);

        ArrayList<String> emptystr=new ArrayList<>();
        for(int i=arr2.size()-1;i>=0;i--){
            String temp3="";
            for(int j=0;j<arr2.get(i).length();j++){
                temp3+=arr2.get(i).charAt(arr2.get(i).length()-1-j);
            }
            emptystr.add(temp3);
        }
        arr2=emptystr;
        System.out.println(arr2);
    }
}
