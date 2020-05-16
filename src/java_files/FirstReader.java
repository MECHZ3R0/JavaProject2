package java_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FirstReader {
    public static void main(String[] args) {
        try{
            File myObj = new File("First File.txt");
            Scanner scan = new Scanner(myObj);
            while(scan.hasNext()){
                System.out.println(scan.nextLine());
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Error: ");
            e.printStackTrace();
        }
    }
}
