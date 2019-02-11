package com.twu.biblioteca;
import java.util.Scanner; // import the Scanner class

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
        Book book = new Book("Becoming","obama","2019");
        System.out.println(book.getDescription());
        Book book1= new Book("john story","john","2000");
        Book book2= new Book("jill story","jilla","2010");
        Book book3= new Book("sara story","sara","2017");

        Book[] books = {book1,book2,book3};
        System.out.println("The list of Books we have ");


        // declare a variable that will store the user input
        String userInput;

        //declare a scanner object to read the command line input by user
        Scanner sn = new Scanner(System.in);

        //loop the utility in loop until the user makes the choice to exit
        while(true){
            //Print the options for the user to choose from
            System.out.println("*****Available Options*****");
            System.out.println("*. Press 1 for List of Books");
            System.out.println("*. Press 2 to exit");
            // Prompt the use to make a choice
            System.out.println("Enter your choice:");

            //Capture the user input in scanner object and store it in a pre decalred variable
            userInput = sn.next();

            //Check the user input
            switch(userInput){
                case "1":
                    //do the job number 1
//                    System.out.println("done with job number 1");
                    System.out.println("List of Books is: " );
                    for(int i=0;i<books.length;i++){
                        System.out.println(books[i].getDescription());
                    }
                    break;
                case "2":
                    //exit from the program
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    //inform user in case of invalid choice.
                    System.out.println("Invalid choice. Read the options carefully...");
            }
        }


    }
}
