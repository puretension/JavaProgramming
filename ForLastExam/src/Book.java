
public class Book {
    private String title;
    private String author;
    private String publisher;
    private double price;

    //Book class
    Book(String title,String author,String publisher,double price){
    this.title = title;
    this.author = author;
    this.publisher = publisher;
    this.price = price;
    }

    //getTitle()
    String getTitle() {return this.title;}
    //String getAuthor() {return this.author;}
    //setTitle()
    void setTitle(String title) {this.title = title;} 
    //setAuthor
    void setAuthor(String author) {this.author = author;}
    //setPublisher
    void setPublisher(String publisher) {this.publisher = publisher;}
    //setPrice
    void setPrice(double price) {this.price = price;}
    //displayInfo()
    public void displayInfo() {
        System.out.println("제목: " + title);
        System.out.println("작가: " + author);
        System.out.println("출판사: " + publisher);
        System.out.println("가격: " + price);
    }
}
