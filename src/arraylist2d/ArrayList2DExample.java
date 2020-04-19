package arraylist2d;

import javax.naming.PartialResultException;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2DExample {
    public static void main(String[] args) {
        System.out.println("Method 1:");
        method1();
        System.out.println("Method 2:");
        method2();
    }
    public static void method1(){
        ArrayList<ArrayList<Integer>> twoD =new ArrayList<>();
        ArrayList<Integer> arr1=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> arr2=new ArrayList<>(Arrays.asList(6,7,8,9,10));
        twoD.add(arr1);
        twoD.add(arr2);
        System.out.println(twoD);
        System.out.println("_____________");
        for (ArrayList<Integer> row:twoD){
            for (int column:row){
                System.out.print(column+", ");
            }
            System.out.println();
        }

    }
    public static void method2(){
        ArrayList<ArrayList<Integer>> twoD=new ArrayList<>();
        int number=1;
        for (int i=0;i<2;i++){
            twoD.add(new ArrayList<>());
            for (int j=0;j<5;j++){
                twoD.get(i).add(number);
                number++;
            }
        }
        System.out.println(twoD);
        System.out.println("-------");
        for (int i=0;i<twoD.size();i++){
            System.out.println(twoD.get(i));
        }
        System.out.println("-------");
        for (int i=0;i<twoD.size();i++){
            for (int j=0;j<twoD.get(i).size();j++){
                System.out.print(twoD.get(i).get(j)+", ");
            }
        }
        System.out.println("--------");
        System.out.println("With While loop:");
        int i=0;
        while (i<twoD.size()){
            int j=0;
            while (j<twoD.get(i).size()){
                System.out.print(twoD.get(i).get(j)+", ");
                j++;
            }
            i++;
        }
    }
}
