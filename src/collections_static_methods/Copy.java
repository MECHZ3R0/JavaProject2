package collections_static_methods;

import java.util.*;

public class Copy {
    public static void main(String[] args) {
        List<Integer> numbers=new LinkedList<>();
        Random rand=new Random();
        for (int i=0;i<50;i++){
            numbers.add(rand.nextInt(50));
        }
        System.out.println(numbers);
        List<Integer> emptyList=new LinkedList<>();
        for(int i=0;i<50;i++){
            emptyList.add(0);
        }
        System.out.println(emptyList);
        Collections.copy(emptyList,numbers);
        System.out.println(emptyList);

    }
}
