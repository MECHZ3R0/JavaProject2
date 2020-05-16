package comparator_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookClassTest {
    public static void main(String[] args) {
        List<BookClass> book =new ArrayList<>();
        book.add(new BookClass("Physics","Servey", 1200));
        book.add(new BookClass("Chemistry","Mendeleev", 1600));
        book.add(new BookClass("Biology","Richardson", 1100));
        book.add(new BookClass("Calculus","Newton", 800));
        Collections.sort(book, new TitleSorting());
        for (BookClass books:book) {
            System.out.println(books.getTitle()+"\t"+books.getAuthor()+"\t"+books.getPage());
        }
        System.out.println("-------------");
        Collections.sort(book, new AuthorSorting());
        for (BookClass books:book) {
            System.out.println(books.getTitle()+"\t"+books.getAuthor()+"\t"+books.getPage());
        }
        System.out.println("-------------");
        Collections.sort(book, new PageSorting());
        for (BookClass books:book) {
            System.out.println(books.getTitle()+"\t"+books.getAuthor()+"\t"+books.getPage());
        }
        System.out.println("-------------");
        Collections.sort(book, new TitleSorting().reversed());
        for (BookClass books:book) {
            System.out.println(books.getTitle()+"\t"+books.getAuthor()+"\t"+books.getPage());
        }
        System.out.println("-------------");
    }
}
