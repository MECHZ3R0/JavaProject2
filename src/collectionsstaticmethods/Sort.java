package collectionsstaticmethods;

import java.util.*;

public class Sort {
    public static void main(String[] args) {
        List<Integer> numbers=new LinkedList<>();
        Random rand=new Random();
        for (int i=0;i<50;i++){
            numbers.add(rand.nextInt(50));
        }
        System.out.println("Unsorted version:");
        numbers.forEach(System.out::println);
        System.out.println("Natural order sorting:");
        Collections.sort(numbers);
        numbers.forEach(System.out::println);
        System.out.println("Reverse natural order sorting:");
        Collections.sort(numbers, Comparator.reverseOrder());
        numbers.forEach(System.out::println);
    }
}
