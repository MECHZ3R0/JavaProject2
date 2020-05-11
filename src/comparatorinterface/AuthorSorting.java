package comparatorinterface;

import java.util.Comparator;

public class AuthorSorting implements Comparator<BookClass> {
    public int compare(BookClass book1, BookClass book2){
        return book1.getAuthor().compareTo(book2.getAuthor());
    }
}
