package com.twu.biblioteca;

public class Book {
    String title;
    String author;
    String publicationYear;
    public Book(String title,String author, String publicationYear){
        this.title=title;
        this.author=author;
        this.publicationYear=publicationYear;
    }
    public String getDescription(){
        return "This book's name is " + this.title +" written by "+this.author;
    }
}
