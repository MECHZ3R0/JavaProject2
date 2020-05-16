package java_files;

import java.io.File;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) throws Exception {
        File data1=new File("data.txt");
        File data2=new File("data.txt");
        merge(data1,data2);
        File data3=new File("merged data.txt");
        find("Apple",data3);
        delete("Chips:",data3);
        deleteDuplicates(data3);
        update("Apple", "Banana:", data3);
        update2("Apple", "Banana", data3);
    }
    public static void merge(File data1, File data2) throws Exception{
        Scanner scan1 = new Scanner(data1);
        Scanner scan2 = new Scanner(data2);
        FileWriter write = new FileWriter("merged data.txt");
        while(scan1.hasNext()){
            write.write(scan1.nextLine());
            write.write("\n");
        }
        while(scan2.hasNext()){
            write.write(scan2.nextLine());
            write.write("\n");
        }
        write.close();
    }
    public static void find(String value, File data3) throws Exception{
        Scanner scan = new Scanner(data3);
        String result;
        while (scan.hasNext()){
            result=scan.next();
            if(result.contains(value)) {
                System.out.println(result);
            }
        }
        scan.close();
    }
    public static void delete(String value, File data3) throws Exception{
        Scanner scan = new Scanner(data3);
        String result="";
        while (scan.hasNext()){
            result+=scan.next();
            result+=" ";
        }
        scan.close();
        data3.delete();
        String[] str = result.split(" ");
        FileWriter write =new FileWriter(data3);
        for (int i = 0; i < str.length; i++) {
            if(!str[i].contains(value)) {
                write.write(str[i]);
                write.write("\n");
            }
        }
        write.close();
    }
    public static void deleteDuplicates(File data3) throws Exception{
        Scanner scan = new Scanner(data3);
        HashSet<String> hs =new HashSet<>();
        while (scan.hasNext()){
            hs.add(scan.nextLine());
        }
        scan.close();
        data3.delete();
        FileWriter write =new FileWriter(data3);
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()){
            write.write(itr.next());
            write.write("\n");
        }
        write.close();
    }
    public static void update(String oldValue, String newValue, File data3) throws Exception {
        Scanner scan = new Scanner(data3);
        LinkedList<String> result = new LinkedList<>();
        while (scan.hasNext()) {
            result.add(scan.nextLine());
        }
        scan.close();
        data3.delete();
        FileWriter write = new FileWriter(data3);
        String[] splitter;
        String connector="";
        for (int i = 0; i < result.size(); i++) {
            splitter=result.get(i).split(" ");
            for (int j = 0; j < splitter.length; j++) {
                if(splitter[j].contains(oldValue)){
                    splitter[j]=newValue;
                }
            }
            for (int j = 0; j < splitter.length; j++) {
                connector+=splitter[j];
                connector+=" ";
            }
            result.set(i,connector);
            connector="";
        }
        for (int i = 0; i < result.size(); i++) {
            write.write(result.get(i));
            write.write("\n");
        }
        write.close();
    }
    public static void update2(String oldValue, String newValue, File data3) throws Exception {
        Scanner scan = new Scanner(data3);
        String data="";
        while (scan.hasNext()) {
            data+=scan.nextLine()+"\n";
        }
        scan.close();
        data3.delete();
        String result = data.replaceAll(oldValue,newValue);
        FileWriter write = new FileWriter(data3);
        write.write(result);
        write.close();
    }
}
