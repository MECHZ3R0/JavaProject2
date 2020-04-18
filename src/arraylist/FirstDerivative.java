package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDerivative {
    public static void main(String[] args) {
        int[] arr = new int[] {8,5,4,2,9};
        ArrayList<Integer> arrayList=new ArrayList<>(Arrays.asList(8,5,4,2,9));
        System.out.println(derivative(arr));
        System.out.println(derivative(arrayList));
    }
    public static ArrayList<Integer> derivative(int[] arr) throws IndexOutOfBoundsException{
        ArrayList<Integer> arrlist=new ArrayList<>();
        try{
            for (int i=0;i<arr.length;i++){
                arrlist.add(Math.abs(arr[i]-arr[i+1]));
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e+" <<for the line 17>>");
        }
        finally {
            return arrlist;
        }
    }
    public static ArrayList<Integer> derivative(ArrayList<Integer> arr) throws IndexOutOfBoundsException{
        ArrayList<Integer> arrlist=new ArrayList<>();
        try {
            for (int i = 0; i < arr.size() - 1; i++) {
                arrlist.add(Math.abs(arr.get(i) - arr.get(i + 1)));
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally {
            return arrlist;
        }
    }
}
