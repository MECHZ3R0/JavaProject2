package arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class RandomNumbersIntegerListExample {
    public static void main(String[] args) {
        //empty array list
        ArrayList<Integer> arrlist=new ArrayList<Integer>();
        Random rnd = new Random();
        //generating random numbers without boundaries ranging from - to +
        System.out.println(rnd.nextInt());
        //generating random numbers without boundaries with absolute value
        System.out.println(Math.abs(rnd.nextInt()));
        //generating random numbers with boundary between 0 and 1000
        System.out.println(rnd.nextInt(1000));
        //assigning random numbers using random class to empty array list
        for(int i=0;i<100;i++){
            arrlist.add(rnd.nextInt(1000));
        }
        System.out.println(arrlist);
        //sorting random numbers inside array list using sorting from collections class
        Collections.sort(arrlist);
        System.out.println(arrlist);
        System.out.println("Min number is: "+arrlist.get(0));
        System.out.println("Max number is: "+arrlist.get(arrlist.size()-1));
        System.out.println("Median is: "+arrlist.get(arrlist.size()/2));
        System.out.print("First 3 Min numbers are ");
        for (int i=0;i<3;i++){
            System.out.print(arrlist.get(i)+", ");
        }
        System.out.println();
        System.out.print("First 3 Max numbers are ");
        for (int i=1;i<4;i++){
            System.out.print(arrlist.get(arrlist.size()-i)+", ");
        }
    }
}
