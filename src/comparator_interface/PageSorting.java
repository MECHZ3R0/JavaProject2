package comparator_interface;

import java.util.Comparator;

public class PageSorting implements Comparator<BookClass> {
    public int compare(BookClass book1, BookClass book2){
        if(book1.getPage()==book2.getPage()) return 0;
        else if(book1.getPage()>book2.getPage()) return 1;
        else return -1;
    }
}
