package questions;

import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListIn2D {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<ArrayList<String>> arr=new ArrayList<>();
        String entry;
        for (int i=0;i<5;i++){
            arr.add(new ArrayList<>());
            entry=scan.nextLine();
            arr.get(i).addAll(Arrays.asList(entry.split(" ")));
        }
        while(scan.hasNext()){
            try {
                System.out.println(arr.get(scan.nextInt()-1).get(scan.nextInt()-1));
            }
            catch (Exception e) {
                System.out.println("error");
            }
        }
    }
}
