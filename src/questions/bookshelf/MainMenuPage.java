package questions.bookshelf;

import inheritance.B;

import java.io.IOException;
import java.util.Scanner;

public class MainMenuPage {
    public static void main(String[] args) throws IOException {
        BookFile books = new BookFile("books.txt");
        Scanner scan = new Scanner(System.in);
        String input;
        do{
            System.out.println("Welcome to BookShelf Menu page.");
            System.out.println("Press buttons 1-4 to select specific function below::");
            System.out.println("1 - Add New Book");
            System.out.println("2 - List All Books");
            System.out.println("3 - List Lost Books");
            System.out.println("4 - Exit");
            System.out.print("Your selection (1-4): ");
            input = scan.nextLine();
            switch (input){
                case "1":
                    books.addBook(BookInformation.getBookInfo());
                    break;
                case "2":
                    books.displayAllBooks();
                    break;
                case "3":
                    books.displayLostBooks();
                    break;
                case "4":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Unknown selections detected. Menu Page is initializing...");
                    break;
            }
        }
        while(!input.equals("4"));
    }
}
