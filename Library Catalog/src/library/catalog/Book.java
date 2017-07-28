package library.catalog;

public class Book {

    String title, author;
    int pageCount;
    double isbn;
    boolean checkedBook, reserved;

    public Book(String newTitle, String newAuthor, double newIsbn, int newPageCount, boolean newCheckedBook, boolean newReserved) {

        title = newTitle;
        author = newAuthor;
        pageCount = newPageCount;
        isbn = newIsbn;
        checkedBook = newCheckedBook;
        reserved = newReserved;

    }

    public void printBook() {

        System.out.print(title + ", " + author + ". " + isbn + ", " + pageCount);
        if (checkedBook == true) {
            System.out.println(" - Checked Out");
        } else {
            if (reserved == true) {
                System.out.println(" - Book not available: Reserved");
            } else {
                System.out.println(" - Available for Checkout");
            }
        }

    }
}
