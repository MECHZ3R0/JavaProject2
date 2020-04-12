package arraylist;

import java.util.ArrayList;

public class ArrayListLoops {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist= new ArrayList<Integer>();
        arrlist.add(4);
        arrlist.add(10);
        arrlist.add(50);
        //regular for loop
        for (int i=0;i<arrlist.size();i++){
            System.out.print(arrlist.get(i)+"\t");
        }
        System.out.println();
        //advanced for loop
        for(Integer column:arrlist){
            System.out.print(column+"\t");
        }
        System.out.println();
        //while loop
        int i=0;
        while (i<arrlist.size()){
            System.out.print(arrlist.get(i)+"\t");
            i++;
        }
    }
}
