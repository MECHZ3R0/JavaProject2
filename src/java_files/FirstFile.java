package java_files;

import java.io.File;
import java.io.IOException;

public class FirstFile {
    public static void main(String[] args) {
        File myFile = new File("First File.txt");
        try{
            if(myFile.createNewFile()){
                System.out.println("New file successful: "+myFile);
            }
            else {
                System.out.println("File with the same name already exists");
            }
        }
        catch(IOException e){
            System.out.println("Error: \n"+e);
        }
    }
}
