package com.twu.biblioteca;
import java.util.Scanner; // import the Scanner class


public class BibliotecaApp {
    Printer printer; //field
    Reader reader;
    Boolean loggedIn = false;

    //constructor
    public BibliotecaApp(Printer printer,Reader reader) {
        this.printer = printer;
        this.reader=reader;
    }
    void launchApp() {
        String libraryNum;
        String passWord;
        Admin admin= new Admin(printer);
        User user1 = new User("123-1234","123456","sara","sara@yahoo.com","0447427");
        User user2 = new User("567-5678","567891","jack","jack@yahoo.com","043456");

        User[] users = {user1,user2};

        printer.print("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
        while(!loggedIn){
            printer.print("please Login first: Enter your library number");
            libraryNum = reader.read();
            printer.print("please Login first: Enter your password");
            passWord = reader.read();
            this.loggedIn = admin.login(users,libraryNum,passWord);

        }
//
        Book book = new Book("Becoming","obama","2019");
//        printer.print(book.getDescription());
        Book book1= new Book("john story","john","2000");
        Book book2= new Book("jill story","Ben","2010");
        Book book3= new Book("sara story","sara","2017");

        Book[] books = {book1,book2,book3};
//        printer.print("The list of Books we have ");

        Movie movie1 = new Movie("braveheart",2005, "Mel Gibson",10);
        Movie movie2 = new Movie("titanic",2000, "james Cameron",8);
        Movie movie3 = new Movie("pride and prejudice",1990,"sara loyd",4);
        Movie movie4 = new Movie("hangover",2012,"george blue",1);



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
            printer.print("*. Press 3 to checkIn");
            printer.print("*. Press 4 to exit");
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
                        if(books[i].getAvailabilty())
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
                case "3" :
                    printer.print("return a book");
                    printer.print("which book do you wanna return?");
                    String bookToReturn=reader.read();
                    Book BookReturn =this.searchBook(bookToReturn, books);
                    this.checkIn(BookReturn);
                    break;
                case "4":
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
        if(book.getAvailabilty()){
            book.setAvailabilty(false);
            printer.print("Thank you, Enjoy the book");
        }
        }

        Book searchBook(String bookName,Book[] books){
//            Book book = new Book("Becoming","obama","2019");
            for(Book item: books) {
//                printer.print(item.title);
//                printer.print(bookName);
                if ((item.getTitle()).equals(bookName)) {
//                    printer.print("hi");
                    return item;
                }
            }
            return null;
        }
        void checkIn(Book book){
            if(book == null){
                printer.print("that is not a valid book to return");
                return;
            }
            if(!book.getAvailabilty()){
                book.setAvailabilty(true);
                printer.print("Thank you for returning the book");
            }
        }
    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp(new Printer(),new Reader());
        bibliotecaApp.launchApp();

    }
}
