package exceptions;

import java.util.Arrays;

public class Transverse {
    public static void main(String[] args) {
        int[][] arr={{1,2},{3,4},{5,6}};
        for (int[] row: arr){
            System.out.println(Arrays.toString(row));
        }
        System.out.println(Arrays.toString(arr));
        try{
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[0].length;j++){
                    System.out.print(arr[j][i]+"\t");
                }
                System.out.println();
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error detected");
        }
        finally{
            System.out.println("Hello World");
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                try {
                    System.out.print(arr[j][i] + "\t");
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Error Detected");
                }
            }
            System.out.println();
        }
    }
}
