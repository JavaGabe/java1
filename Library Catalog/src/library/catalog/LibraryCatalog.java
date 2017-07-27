package library.catalog;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryCatalog {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Book b1 = new Book("Sherlock Holmes", "Sir Arthur Conan Doyle", 827463, 233, false);
        Book b2 = new Book("Oliver Twist", "Sir Charles Dickens", 976244, 427, false);
        ArrayList<Book> catalog = new ArrayList<Book>();
            catalog.add(b1);
            catalog.add(b2);
        
        for (Book b : catalog) {
            b.printBook();
        }
        System.out.println("Would you like to");
        System.out.println("\tA Check Out");
        System.out.println("\tB Return");
        System.out.println("Would you like to");
        System.out.println("Would you like to");
    }

}
