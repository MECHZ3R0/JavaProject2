package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SameDifferences {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(2,4,6,10,11));
        ArrayList<Integer> diff=new ArrayList<>();
        for (int i=0;i<arr.size()-1;i++){
            for(int j=i+1;j<arr.size();j++){
                diff.add(Math.abs(arr.get(i)-arr.get(j)));
            }
        }
        ArrayList<Integer> dupl=new ArrayList<>();
        for (int k=0;k<diff.size();k++){
            for (int t=k+1;t<diff.size();t++) {
                if (diff.get(k)==diff.get(t)&&!dupl.contains(diff.get(k))) {
                    dupl.add(diff.get(k));
                }
            }
        }
        System.out.println(dupl);
    }
}