package arraylist2d;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Multiply2DArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> twoD=new ArrayList<>();
        for (int i=0;i<10;i++){
            twoD.add(new ArrayList<>());
            for (int j=0;j<10;j++){
                twoD.get(i).add((int)(Math.random()*10));
            }
        }
        System.out.println(twoD);
        multarr(twoD);
        multbyarr(twoD);
    }
    public static void multarr(ArrayList<ArrayList<Integer>> twoD){
        ArrayList<ArrayList<Integer>> temptwoD =new ArrayList<>();
        for (int i=0;i<twoD.size();i++){
            temptwoD.add(new ArrayList<>());
            for (int j=0;j<twoD.get(i).size();j++){
                temptwoD.get(i).add(twoD.get(i).get(j)*twoD.get(i).get(j));
            }
        }
        System.out.println(temptwoD);
    }
    public static void multbyarr(ArrayList<ArrayList<Integer>> twoD){
        ArrayList<Integer> multiplierArr=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        ArrayList<ArrayList<Integer>> temptwoD =new ArrayList<>();
        for (int i=0;i<twoD.size();i++){
            temptwoD.add(new ArrayList<>());
            for (int j=0;j<twoD.get(i).size();j++){
                temptwoD.get(i).add(twoD.get(i).get(j)*multiplierArr.get(j));
            }
        }
        System.out.println(temptwoD);
    }
}
