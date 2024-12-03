package Study.Java.Bassic;

public class LibraryBookRegister {
    private final String bookName;
    private final String writer;
    private int id = 0;

    public LibraryBookRegister(String bookName, String writer) {
        this.bookName = bookName;
        this.writer = writer;
    }

    private int getId() {return id;}

    public int setId() {return ++id;}


    private String getBookName() {return bookName;}

    private String getWriter() {return writer;}

    public String toString() {
        return bookName + " / " + writer;}
}
