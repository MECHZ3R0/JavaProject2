package interfaces;

import java.util.Date;

public abstract class Document {
    private String[] authors;
    private Date date;

    public String[] getAuthors() {
        return authors;
    }

    public void addAuthors(String[] authors) {
        this.authors = authors;
    }

    public Date getDate() {
        return date;
    }
}
