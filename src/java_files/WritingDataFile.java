package java_files;

import org.w3c.dom.CDATASection;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class WritingDataFile {
    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("data.txt");
        writer.write("Apple:  \t$2.99\n");
        writer.write("Chips:  \t$2.49\n");
        writer.write("Avocado:\t$6.99\n");
        writer.write("Orange:  \t$3.99");
        writer.close();
        File data = new File("data.txt");
        read(data);
        System.out.println("-----");
        productsStartWithA(data);
        System.out.println("-----");
        countCharacters(data);
        System.out.println("-----");
        countProducts(data);
    }
    public static void read(File data) throws Exception{
        Scanner scan = new Scanner(data);
        while(scan.hasNext()) {
            System.out.println(scan.nextLine());
        }
        scan.close();
    }
    public static void productsStartWithA(File data) throws Exception{
        Scanner scan = new Scanner(data);
        String temp;
        while (scan.hasNext()){
            temp=scan.nextLine();
            if(temp.charAt(0)=='A'){
                System.out.println(temp);
            }
        }
        scan.close();
    }
    public static void countCharacters(File data) throws Exception{
        Scanner scan = new Scanner(data);
        int charCounter=0;
        while(scan.hasNext()) {
            charCounter+=scan.nextLine().length();
        }
        System.out.println("Character count is "+charCounter);
        scan.close();
    }
    public static void countProducts(File data) throws Exception{
        Scanner scan = new Scanner(data);
        int k=0;
        while(scan.hasNext()) {
            scan.nextLine();
            k++;
        }
        System.out.println("Product count is "+k);
        scan.close();
    }
}
