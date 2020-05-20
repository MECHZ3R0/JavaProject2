package java_object_casting;

public class Upcasting {
    public static void main(String[] args) {
        Dictionary dictionary=new Dictionary(500,1300);
        dictionary.pages=400;
        dictionary.words=1100;
        dictionary.read();
        dictionary.lookUp();
        Book book = (Book) dictionary;
        book.pages=600;
        book.read();
    }
}
class Book{
    int pages;
    public Book(int pages){
        this.pages=pages;
    }
    public void read(){
        System.out.println("Reading");
    }
}
class Dictionary extends Book{
    int words;
    public Dictionary(int pages, int words){
        super(pages);
        this.words=words;
    }
    public void lookUp(){
        System.out.println("Looking");
    }
}
