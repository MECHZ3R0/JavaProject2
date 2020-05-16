package comparator_interface;

import java.util.Comparator;

public class AgeSorting implements Comparator<Student> {
    public int compare (Student st1, Student st2){
        if(st1.age==st2.age){
            return 0;
        }
        else if (st1.age>st2.age){
            return 1;
        }
        else {
            return -1;
        }
    }
}
