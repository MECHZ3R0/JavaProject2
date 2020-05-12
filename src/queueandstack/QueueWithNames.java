package queueandstack;

import java.util.LinkedList;
import java.util.Queue;

public class QueueWithNames {
    public static void main(String[] args) {
        Queue<String> qString = new LinkedList<>();
        qString.add("Alpha");
        qString.add("Beta");
        qString.add("Gamma");
        System.out.println(qString);
        System.out.println(qString.remove());
        System.out.println(qString);
        System.out.println(qString.remove());
        System.out.println(qString);
        System.out.println(qString.remove());
        System.out.println(qString);
    }
}
