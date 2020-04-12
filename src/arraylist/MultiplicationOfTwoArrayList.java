package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplicationOfTwoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> int1=new ArrayList<>(Arrays.asList(2,-5,4,-2));
        ArrayList<Integer> int2=new ArrayList<>(Arrays.asList(6,4,-5,-2));
        System.out.println(arrmultiply(int1, int2));

    }
    public static ArrayList<Integer> arrmultiply(ArrayList<Integer> int1, ArrayList<Integer> int2){
        ArrayList<Integer> mult=new ArrayList<>();
        for(int i=0;i<int1.size();i++){
            mult.add(int1.get(i)*int2.get(i));
        }
        return mult;
    }
}
