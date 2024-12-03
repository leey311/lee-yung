package Saying_App_Study;

public class Saying {
    private String saying;
    private String author;

    public Saying(String saying, String author){
        this.saying = saying;
        this.author = author;
    }

    public String getSaying(){
        return saying;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setSaying(String saying) {
        this.saying = saying;
    }

    @Override
    public String toString(){
        return saying + " / " + author;
    }
}