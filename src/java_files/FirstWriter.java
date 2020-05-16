package java_files;

import java.io.FileWriter;
import java.io.IOException;

public class FirstWriter {
    public static void main(String[] args) {
        try{
            FileWriter writeFile = new FileWriter("First File.txt");
            writeFile.write("Java is a programming language.\n");
            writeFile.write("JavaScript is a scripting language.\n");
            writeFile.write("Python is an interpreted language.");
            writeFile.close();
            System.out.println("String Streaming is Successful");
        }
        catch (IOException e){
            System.out.println("Error: ");
            e.printStackTrace();
        }
    }
}
