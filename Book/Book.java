public class Book {
    private String isbn;
    private String title;
    private String author;
    private double price;

    public Book() {
    }

    public Book(String isbn, String title, String author, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setIsbn(String isbn) {this.isbn = isbn;}
    public void setTitle(String title) {this.title = title;}
    public void setAuthor(String author) {this.author = author;}
    public void setPrice(double price) {this.price = price;}

    public String getIsbn() {return isbn;}
    public String getTitle() {return title;}
    public String getAuthor() {return author;}
    public double getPrice() {return price;}
}
