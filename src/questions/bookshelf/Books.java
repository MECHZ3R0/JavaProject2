package questions.bookshelf;

public class Books {
    private String title;
    private String author;
    private String publisher;
    private int pages;
    private int year;
    private boolean isLost=false;

    public Books(String title, String author, String publisher, int pages, int year) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.pages = pages;
        this.year = year;
    }

    public Books(String title, String author, String publisher, int pages, int year, boolean isLost) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.pages = pages;
        this.year = year;
        this.isLost = isLost;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    public boolean isLost() {
        return isLost;
    }

    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", pages=" + pages +
                ", year=" + year +
                ", isLost=" + isLost +
                '}';
    }
}
