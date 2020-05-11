package comparatorinterface;

import java.util.Comparator;

public class TitleSorting implements Comparator<BookClass> {
    public int compare(BookClass book1, BookClass book2){
        return book1.getTitle().compareTo(book2.getTitle());
    }
}
