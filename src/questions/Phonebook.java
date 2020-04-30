package questions;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String queryRead = scan.nextLine();
        int queries = Integer.parseInt(queryRead);
        Hashtable<String,String> phoneBook = new Hashtable<>();
        for(int i=0;i<queries;i++){
            phoneBook.put(scan.nextLine(),scan.nextLine());
        }
        ArrayList<String> query = new ArrayList<>();
        for(int i=0;i<queries;i++){
            query.add(scan.nextLine());
        }
        for(String entry:query){
            if (phoneBook.keySet().contains(entry)){
                System.out.println(entry+"="+phoneBook.get(entry));
            }
            else {
                System.out.println("Not found");
            }
        }
    }
}
