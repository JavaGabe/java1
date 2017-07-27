package library.catalog;

public class Book {

    String title, author;
    int pageCount;
    double isbn;
    boolean checkedBook;

    public Book(String newTitle, String newAuthor, double newIsbn, int newPageCount, boolean newCheckedBook) {

        title = newTitle;
        author = newAuthor;
        pageCount = newPageCount;
        isbn = newIsbn;
        checkedBook = newCheckedBook;

    }

    public void printBook() {

        System.out.print(title + ", " + author + ". " + isbn + ", " + pageCount);
        if (checkedBook = true) {
            System.out.println(" - Checked Out");
        } else  {
            System.out.println(" - Available for Checkout");
        }
    }
}
