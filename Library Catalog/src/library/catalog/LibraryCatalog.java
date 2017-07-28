package library.catalog;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryCatalog {

    static ArrayList<Book> catalog;
    static Scanner keyboard;
    static ArrayList<Users> accounts;
    static Users current;
    public static void main(String[] args) {
        keyboard = new Scanner(System.in);
        Book b1 = new Book("Sherlock Holmes", "Sir Arthur Conan Doyle", 827463.4, 233, false, false);
        Book b2 = new Book("Oliver Twist", "Sir Charles Dickens", 976244.1, 427, false, false);
        Book b3 = new Book("When You Reach Me", "Rebecca Stead", 616349.7, 268, false, false);
        Book b4 = new Book("Tom Sawyer", "Mark Twain", 323484.1, 187, false, false);
        Book b5 = new Book("Moby Dick", "Herman Melvin", 546587.5, 827, false, false);
        Book b6 = new Book("Da Vinci Code", "Dan Brown", 854231.8, 454, false, false);
        Book b7 = new Book("The Time Traveler's Wife", "Audrey Niffenegger", 625197.4, 534, false, false);
        Book b8 = new Book("The Time Machine", "H.G. Wells", 267367.6, 212, false, false);
        Book b9 = new Book("The Giving Tree", "Schell Silverstein", 865467.3, 45, false, false);
        Book b10 = new Book("The Art of War", "Sun Tzu", 547154.1, 260, false, false);

        Users u1 = new Users("Bob");
        Users u2 = new Users("BookLover");
        Users u3 = new Users("NormalPerson");
        current=null;
        accounts = new ArrayList<Users>();
        accounts.add(u1);
        accounts.add(u2);
        accounts.add(u3);

        catalog = new ArrayList<Book>();
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
        boolean quitfunction = false;
        while (quitfunction == false) {
            System.out.println("What is your username?");
             String answer0 = keyboard.nextLine();
                for (Users u: accounts) {
                    if (u.username.equals(answer0)){
                        current = u;
                    }
                }
                if (current == null) {
                    System.out.println("Invalid Username");
                }
            System.out.println("Would you like to");
            System.out.println("\tA) Check out a book?");
            System.out.println("\tB) Return a book?");
            System.out.println("\tC) Reserve a book?");
            System.out.println("\tD) View books?");
            System.out.println("\tE) Quit?");
            String answer = keyboard.nextLine();
            if (answer.equals("A")) {
                checkOut();
            } else {
                if (answer.equals("B")) {
                    returnBook();
                } else {
                    if (answer.equals("C")) {
                        reserveBook();
                    } else {
                        if (answer.equals("D")) {
                            for (Book b : catalog) {
                                b.printBook();
                            }
                        } else {
                            quitfunction = true;
                            System.out.println("Thank you for your time.");
                        }
                    }
                }
            }

        }
    }
static boolean found = false;

    public static boolean checkOut() {
        System.out.println("Type the title you are looking for:");
        String title = keyboard.nextLine();
        for (Book b : catalog) {
            if (b.title.equals(title)) {
                if (b.reserved == true) {
                    System.out.println("Book is reserved and not available or checkout.");
                    found = true;
                } else if (b.checkedBook == false) {
                   
                    System.out.println("Book found and checked out.");
                    found = true;
                    current.checkOutBook(b);
                } else {
                    System.out.println("Book is already checked out.");
                    found = true;
                }
            }
        }
        if (found == false) {
            System.out.println("Book not found.");
        }

        return true;
    }

    public static boolean returnBook() {
        System.out.println("Type the title you are returning:");
        String title = keyboard.nextLine();
        for (Book b : catalog) {
            if (b.title.equals(title)) {
                if (b.checkedBook == true) {
                    
                    current.returnBook(b);
                    found = true;
                } else {
                    System.out.println("Book already returned.");
                    found = true;
                }
            }
        }
        if (found == false) {
            System.out.println("Book not found.");
        }
        return true;
    }

    public static boolean reserveBook() {
        System.out.println("Type the title you want to reserve:");
        String title = keyboard.nextLine();
        for (Book b : catalog) {
            if (b.title.equals(title)) {
                if (b.checkedBook == true) {
                    System.out.println("Book already checked out.");
                    found = true;
                } else if (b.reserved == false) {
                    b.reserved = true;
                    System.out.println("Book found and reserved.");
                    found = true;
                } else {
                    System.out.println("Book already reserved.");
                    found = true;
                }
            }
        }
        if (found == false) {
            System.out.println("Book not found.");
        }
        return true;
    }
}
