package sortingalgorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={10,8,4,5,2};
        int temp, j;
        for (int i = 1; i < arr.length; i++) {
            temp=arr[i];
            j=i-1;
            while(j>=0&&arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
