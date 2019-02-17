package com.twu.biblioteca;
import java.util.Scanner; // import the Scanner class


public class BibliotecaApp {
    Printer printer; //field
    Reader reader;

    //constructor
    public BibliotecaApp(Printer printer,Reader reader) {
        this.printer = printer;
        this.reader=reader;
    }
    void launchApp() {
        printer.print("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
//
        Book book = new Book("Becoming","obama","2019");
//        printer.print(book.getDescription());
        Book book1= new Book("john story","john","2000");
        Book book2= new Book("jill story","jilla","2010");
        Book book3= new Book("sara story","sara","2017");

        Book[] books = {book1,book2,book3};
//        printer.print("The list of Books we have ");


         //declare a variable that will store the user input
        String userInput;

        //declare a scanner object to read the command line input by user
//        Reader reader = new Reader();

        //loop the utility in loop until the user makes the choice to exit
        while(true){
            //Print the options for the user to choose from
            printer.print("*****Available Options*****");
            printer.print("*. Press 1 for List of Books");
            printer.print("*. Press 2 to checkout");
            // Prompt the use to make a choice
            printer.print("Enter your choice:");

            //Capture the user input in scanner object and store it in a pre decalred variable
            userInput = reader.read();

            //Check the user input
            switch(userInput){
                case "1":
                    //do the job number 1
//                    printer.print("done with job number 1");
                    printer.print("List of Books is: " );
                    for(int i=0;i<books.length;i++){
                        if(books[i].availability)
                        printer.print(books[i].getDescription());
                    }
                    break;
                case "2":
                    printer.print("checkout a book");
                    printer.print("which Book do you wanna checkout?");
                    String bookName=reader.read();
                    //search bookList to find the corresponding book object with the bookName

                    Book specificBook = this.searchBook(bookName, books);

                   // Read more: https://javarevisited.blogspot.com/2012/11/4-ways-to-search-object-in-java-array-example.html#ixzz5fkzAncjB
                    this.checkOut(specificBook);
                    break;
                case "3":
                    //exit from the program
                    printer.print("Exiting...");
                    return;
                default:
                    //inform user in case of invalid choice.
                    printer.print("Invalid choice. please select a valid option...");
            }
        }
//
    }
    void checkOut(Book book) {
        if(book == null){
            printer.print("sorry, That book is not available");
        return;
        }
        if(book.availability){
            book.availability = false;
            printer.print("Thank you, Enjoy the book");
        }
        }

        Book searchBook(String bookName,Book[] books){
            Book book = new Book("Becoming","obama","2019");
            for(Book item: books) {
//                printer.print(item.title);
//                printer.print(bookName);
                if ((item.title).equals(bookName)) {
//                    printer.print("hi");
                    return item;
                }
            }
            return null;
        }
    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp(new Printer(),new Reader());
        bibliotecaApp.launchApp();

    }
}
