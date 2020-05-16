package sorting_algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,8,4,5,2};
        int temp;
        boolean check;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            check=true;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    check=false;
                }
            }
            if (check) break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
