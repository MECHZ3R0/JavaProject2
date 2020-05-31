package questions;

import java.util.HashMap;
//Find the Odd Integer
//https://edabit.com/challenge/8SHAyg8kdX8y72S3z
public class FindTheOddInteger {
    public static void main(String[] args) {
        findOdd(1,1,2,-2,5,2,4,4,-1,-2,5);
        findOdd(20,1,1,2,2,3,3,5,5,4,20,4,5);
        findOdd(10);
    }
    public static void findOdd(int... numbers){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if(hm.containsKey(numbers[i])){
                hm.put(numbers[i],hm.get(numbers[i])+1);
            }
            else {
                hm.put(numbers[i],1);
            }
        }
        for (int i:hm.keySet()) {
            if(hm.get(i)%2!=0){
                System.out.println(i);
            }
        }
    }
}
