package comparator_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student(100,"Alpha", 20));
        students.add(new Student(101,"Beta", 18));
        students.add(new Student(102,"Gamma", 23));
        students.add(new Student(103,"Delta", 19));
        for(Student st:students){
            System.out.println(st.id+"\t"+st.name+"\t"+st.age);
        }
        System.out.println("---------------");
        Collections.sort(students,new AgeSorting());
        for(Student st:students){
            System.out.println(st.id+"\t"+st.name+"\t"+st.age);
        }
        System.out.println("---------------");
        Collections.sort(students,new AgeSorting().reversed());
        for(Student st:students){
            System.out.println(st.id+"\t"+st.name+"\t"+st.age);
        }

        System.out.println("---------------");
        Collections.sort(students,new IdSorting().reversed());
        Iterator<Student> itr = students.iterator();
        Student temp;
        while(itr.hasNext()){
            temp=itr.next();
            System.out.println(temp.id+"\t"+temp.name+"\t"+temp.age);
        }

        System.out.println("---------------");
        Collections.sort(students,new NameSorting().reversed());
        Iterator<Student> itr2 = students.iterator();
        Student temp2;
        while(itr2.hasNext()){
            temp2=itr2.next();
            System.out.println(temp2.id+"\t"+temp2.name+"\t"+temp2.age);
        }
    }
}
