package com.tts;
import java.util.*;

public class Library {
    // Add the missing implementation to this class

    //Library Addresses
    String libraryAddress;

    //Array for Books
    ArrayList<Book> books;

    //Method to address and books
    public Library(String address) {
        libraryAddress = address;
        books = new ArrayList<Book>();
    }

    //Method for adding book to books
    public void addBook(Book book) {
        books.add(book);
    }

    //Method to print addresses
    public void printAddress() {
        System.out.println(libraryAddress);
    }

//    // Method for library hours
//    public static void printOpeningHours() {
//        System.out.println("Libraries are open daily from 9 AM to 5 PM.");
//    }

//    private void returnBook() {
//        String title = "The Lord of the Rings";
//        books.add(0,title);
//    }

    // Method for printing available books
    public void printAvailableBooks() {
        Book libraryBook;
        boolean libraryIsEmpty = true;

//        Unehanced
//        for(int i=0; i<books.size(); i++) {
//            libraryBook = books.get(i);
//            libraryBookTitle = libraryBookTitle();

        // Enhanced for loop
        for(int i=0; i<books.size(); i++) {
            libraryBook = books.get(i);

            if(!(libraryBook.isBorrowed())){
                System.out.println(libraryBook.getTitle());
                libraryIsEmpty = false;
            }
        } if(libraryIsEmpty){
            System.out.println("Sorry, our catalog is empty");
        }


//        // enhanced
//        for (Book book : books) {
//            System.out.println(book);
//        }
//
////         unenhanced
//                for(int i = 0; i<books.size(); i++) {
//                    System.out.println(books.get(i));
//                }
    }

    // Method for borrowing a book
    public String borrowBook(String bookTitle) {
        Book libraryBook;
        String libraryBookTitle;

        for(int i = 0; i < books.size(); i++) {
            libraryBook = books.get(i);
            libraryBookTitle = libraryBook.getTitle();

            if(libraryBookTitle.equals(bookTitle)) {
                if(!(libraryBook.isBorrowed())) {
                    libraryBook.borrowed();
                    System.out.println("We have " + libraryBookTitle + ", and you have successfully borrowed it!");
                    return null;
                } else {
                    System.out.println("Someone else has " +libraryBookTitle + " right now :(");
                    return null;
                }
            }
        }
        System.out.println("Your book was not found in our system, sorry.");
        return null;
    }


    // Method for returning a book
    public String returnBook(String bookTitle) {
        Book libraryBook;
        String libraryBookTitle;
        boolean found = false;

        for (int i = 0; i < books.size(); i++) {
            libraryBook = books.get(i);
            libraryBookTitle = libraryBook.getTitle();

            if (libraryBookTitle.equals(bookTitle)) {

                if (libraryBook.isBorrowed()) {
                    libraryBook.returned();
                    System.out.println("You successfully returned " + libraryBookTitle + "!");
                    found = true;
                    break;
                }

                if (!found) {
                    System.out.println("Are you sure you got the book from here? It isn't in our system.");
                }
            }
        }
        System.out.println();
        return null;


    }


//    public static void main(String[] args) {
//        // Create two libraries
//        Library firstLibrary = new Library("10 Main St.");
//        Library secondLibrary = new Library("228 Liberty St.");
//
//        // Add four books to the first library
//        firstLibrary.addBook(new Book("The Da Vinci Code"));
//        firstLibrary.addBook(new Book("Le Petit Prince"));
//        firstLibrary.addBook(new Book("A Tale of Two Cities"));
//        firstLibrary.addBook(new Book("The Lord of the Rings"));
//
//        // Print opening hours and the addresses
//        System.out.println("Library hours:");
//        printOpeningHours();
//        System.out.println();
//
//        System.out.println("Library addresses:");
//        firstLibrary.printAddress();
//        secondLibrary.printAddress();
//        System.out.println();
//
//        // Try to borrow The Lords of the Rings from both libraries
//        System.out.println("Borrowing The Lord of the Rings:");
//        firstLibrary.borrowBook("The Lord of the Rings");
//        firstLibrary.borrowBook("The Lord of the Rings");
//        secondLibrary.borrowBook("The Lord of the Rings");
//        System.out.println();
//
//        // Print the titles of all available books from both libraries
//        System.out.println("Books available in the first library:");
//        firstLibrary.printAvailableBooks();
//        System.out.println();
//        System.out.println("Books available in the second library:");
//        secondLibrary.printAvailableBooks();
//        System.out.println();
//
//        // Return The Lords of the Rings to the first library
//        System.out.println("Returning The Lord of the Rings:");
//        firstLibrary.returnBook("The Lord of the Rings");
//        System.out.println();
//
//        // Print the titles of available from the first library
//        System.out.println("Books available in the first library:");
//        firstLibrary.printAvailableBooks();
//    }
}

