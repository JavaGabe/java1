package library.catalog;

import java.util.ArrayList;

public class Users {

    String username;
    ArrayList<Book> checkedOutList;
    public Users(String newUsername) {
        username = newUsername;
        checkedOutList=new ArrayList();
    }
    public void checkOutBook(Book b) {
        b.checkedBook = true;
        checkedOutList.add(b);
        System.out.println(b.title+" Checked Out Successfully");
        
    }
    
    public void returnBook(Book c) {
        if (checkedOutList.contains(c)) {
            c.checkedBook = false;
            checkedOutList.remove(c);
            System.out.println(c.title+" Returned Successfully");
        }else {
            System.out.println("Return Unsuccessful: Book not checked out by you.");
        }
    }
    
}
