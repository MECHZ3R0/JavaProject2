package questions;

import java.util.ArrayList;
//Longest Consecutive Run
//https://edabit.com/challenge/NwSd26PwgggJquov3
public class LongestConsecutiveRun {
    public static void main(String[] args) {
        longestRun(1,2,3,5,6,7,8,9);
        longestRun(1, 2, 3, 10, 11, 15);
        longestRun(5, 4, 2, 1);
        longestRun(3, 5, 7, 10, 15);
    }
    public static void longestRun(int... numbers){
        int count, startCounter=numbers[0];
        ArrayList<Integer> countStorage = new ArrayList<>();
        for (int i = 0; i < numbers.length;) {
            count=0;
            while(i < numbers.length){
                if(!(numbers[i]==startCounter)){
                    break;
                }
                i++;
                startCounter++;
                count++;
            }
            startCounter=startCounter-2;
            while(i < numbers.length){
                if(!(numbers[i]==startCounter)){
                    break;
                }
                i++;
                startCounter--;
                count++;
            }
            countStorage.add(count);
            if(i < numbers.length) {
                startCounter = numbers[i];
            }
        }
        System.out.println(bigNumberCountStorage(countStorage));
    }
    public static int bigNumberCountStorage(ArrayList<Integer> countStorage){
        int m=1;
        for (int i = 0; i < countStorage.size(); i++) {
            if(countStorage.get(i)>m){
                m=countStorage.get(i);
            }
        }
        return m;
    }
}
