package questions;

import java.util.HashSet;

public class SameAmountOfUniqueNumbers {
    public static void main(String[] args) {
        int[] arr1={1,3,4,4,4};
        int[] arr2={2,5,7};
        System.out.println(isUniqueSameAmountWithCollection(arr1,arr2));
        System.out.println(isUniqueSameAmountWithArray(arr1,arr2));
    }
    public static boolean isUniqueSameAmountWithCollection(int[] arr1,int[] arr2){
        HashSet<Integer> hs1=new HashSet<>();
        HashSet<Integer> hs2=new HashSet<>();
        for (int i=0;i<arr1.length;i++){
            hs1.add(arr1[i]);
        }
        for (int i=0;i<arr2.length;i++){
            hs2.add(arr2[i]);
        }
        if (hs1.size()==hs2.size()){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean isUniqueSameAmountWithArray(int[] arr1,int[] arr2){
        String temp="";
        for (int i=0;i<arr1.length;i++){
            if (!temp.contains(""+arr1[i])){
                temp+=arr1[i]+" ";
            }
        }
        String[] arrt1=temp.split(" ");
        temp="";
        for (int i=0;i<arr2.length;i++){
            if (!temp.contains(""+arr2[i])){
                temp+=arr2[i]+" ";
            }
        }
        String[] arrt2=temp.split(" ");
        if (arrt1.length==arrt2.length){
            return true;
        }
        else {
            return false;
        }
    }
}
