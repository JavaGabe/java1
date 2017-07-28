package library.catalog;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryCatalog {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Book b1 = new Book("Sherlock Holmes", "Sir Arthur Conan Doyle", 827463.4, 233, false);
        Book b2 = new Book("Oliver Twist", "Sir Charles Dickens", 976244.1, 427, false);
        Book b3 = new Book("When You Reach Me", "Rebecca Stead", 616349.7, 268, false);
        Book b4 = new Book("Tom Sawyer", "Mark Twain", 323484.1, 187, false);
        Book b5 = new Book("Moby Dick", "Herman Melvin", 546587.5, 827, false);
        Book b6 = new Book("Da Vinci Code", "Dan Brown", 854231.8, 454, false);
        Book b7 = new Book("The Time Traveler's Wife", "Audrey Niffenegger", 625197.4, 534, false);
        Book b8 = new Book("The Time Machine", "H.G. Wells", 267367.6, 212, false);
        Book b9 = new Book("The Giving Tree", "Schell Silverstein", 865467.3, 45, false);
        Book b10 = new Book("The Art of War", "Sun Tzu", 547154.1, 260, false);

        ArrayList<Book> catalog = new ArrayList<Book>();
        catalog.add(b1);
        catalog.add(b2);
        catalog.add(b3);
        catalog.add(b4);
        catalog.add(b5);
        catalog.add(b6);
        catalog.add(b7);
        catalog.add(b8);
        catalog.add(b9);
        catalog.add(b10);

        for (Book b : catalog) {
            b.printBook();
        }
        System.out.println("Would you like to");
        System.out.println("\tA) Check out a book?");
        System.out.println("\tB) Return a book?");
        System.out.println("\tC) Reserve a book?");
        System.out.println("\tD) View overdue books and fees?");
        System.out.println("\tE) Quit?");
        String answer = keyboard.nextLine();
        if (answer.equals("A")) {
            checkOut();
            //Print options of books and an option to check out. Also, change checkedOut to true.
            //function>
            //print type a title
            // for (book b: catalog)
            //IF B.GETtITLE().EQUALKS(TITLE) {
            //B.SETCHECKEDOUT(TURE)
            //boolean found = true
        } else {
            if (answer.equals("B")) {
                //Print options of books and an option to return. Also, change checkedOut to false.
            } else {
                if (answer.equals("C")) {
                    //Print options of books.
                } else {
                    if (answer.equals("D")) {
                        //Print report of all fees.
                    } else {
                        //Change a variable to break while loop and end program.
                    }
                }
            }
        }

    }

    public static boolean checkOut() {
        return true;
    }
}
