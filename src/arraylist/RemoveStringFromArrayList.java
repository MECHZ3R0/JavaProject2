package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveStringFromArrayList {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<String> str = new ArrayList<>(Arrays.asList("One","Two","Three","Four"));
        System.out.println(str);
        System.out.print("Enter item to remove: ");
        String item=scan.nextLine();
        str.remove(item);
        System.out.println(str);
        System.out.print("Enter item to remove: ");
        String item2=scan.nextLine();
        System.out.println(removeString(str,item2));
    }
    public static ArrayList<String> removeString(ArrayList<String> str, String item){
        ArrayList<String> str2=new ArrayList<>();
        for (String items:str){
            if (!items.contains(item)){
                str2.add(items);
            }
        }
        return str2;
    }
}
