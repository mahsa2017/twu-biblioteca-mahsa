package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
        Book book = new Book("Becoming","obama","2019");
        System.out.println(book.getDescription());
        Book book1= new Book("john story","john","2000");
        Book book2= new Book("jill story","j","2010");
        Book book3= new Book("sara story","sara","2017");

        Book[] books = {book1,book2,book3};
        System.out.println("The list of Books we have ");

        for(int i=0;i<books.length;i++){
            System.out.println(books[i].getDescription());
        }
    }
}
