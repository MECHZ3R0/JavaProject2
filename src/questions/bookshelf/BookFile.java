package questions.bookshelf;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BookFile {
    String filePath;
    public BookFile(String filePath) {
        this.filePath = filePath;
    }
    public void makeFile(){
        File file = new File(this.filePath);
        try{
            file.createNewFile();
        }
        catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }
        System.out.println("New computer file is ready: "+this.filePath);
    }
    public void addBook(Books newBook) throws IOException {
        FileWriter writer = new FileWriter(this.filePath);
        String addBook = newBook.getTitle()+", "+newBook.getAuthor()+", "+newBook.getPublisher()+", "+newBook.getPages()+", "+newBook.getYear()+"\n";
        writer.append(addBook);
        writer.close();
    }
    public void displayAllBooks() throws IOException{
        File file = new File(this.filePath);
        Scanner scan = new Scanner(file);
        System.out.printf("%20s\t%20s\t%15s\t%5s\t%4s\t\n","Book Title","Author","Publisher","Pages","Year");
        String[] arr;
        while(scan.hasNext()){
            arr=scan.nextLine().split(", ");
            System.out.printf("%20s\t%20s\t%15s\t%5s\t%4s\t\n",arr[0],arr[1],arr[2],arr[3],arr[4]);
        }
        scan.close();
    }
    public void displayLostBooks() throws IOException{
        File file = new File(this.filePath);
        Scanner scan = new Scanner(file);
        System.out.printf("%20s\t%20s\t%15s\t%5s\t%4s\t\n","Book Title","Author","Publisher","Pages","Year");
        String[] arr;
        while(scan.hasNext()){
            arr=scan.nextLine().split(", ");
            if(arr[5].equals("false")) {
                System.out.printf("%20s\t%20s\t%15s\t%5s\t%4s\t\n", arr[0], arr[1], arr[2], arr[3], arr[4]);
            }
        }
        scan.close();
    }
}
