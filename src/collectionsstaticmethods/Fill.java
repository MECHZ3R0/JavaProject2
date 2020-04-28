package collectionsstaticmethods;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Fill {
    public static void main(String[] args) {
        List<Integer> numbers=new LinkedList<>();
        Random rand=new Random();
        for (int i=0;i<50;i++){
            numbers.add(rand.nextInt(50));
        }
        System.out.println(numbers);
        Collections.fill(numbers,5);
        System.out.println(numbers);
    }
}
