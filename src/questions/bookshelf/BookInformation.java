package questions.bookshelf;

import interfaces.Book;

import java.util.Scanner;

public class BookInformation {
    public static Books getBookInfo(){
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the Title of the Book?: ");
        String title = scan.nextLine();
        System.out.print("Who is the Author of the Book?: ");
        String author = scan.nextLine();
        System.out.print("Who is the Publisher of the Book?: ");
        String publisher = scan.nextLine();
        System.out.print("How many Pages are there in the Book?: ");
        int pages = Integer.parseInt(scan.nextLine());
        System.out.print("When the Book was Published?: ");
        int year = Integer.parseInt(scan.nextLine());
        Books newBook = new Books(title,author,publisher,pages,year);
        return newBook;
    }
}
