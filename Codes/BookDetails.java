class Book {
    String title;
    Book(String t) { title = t; }
    void show() { System.out.println("Book: " + title); }
}
public class BookDetails {
    public static void main(String[] args) {
        new Book("Java Programming").show();
    }
}
