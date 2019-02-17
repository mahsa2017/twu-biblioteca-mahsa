package com.twu.biblioteca;

public class Book {
    String title;
    String author;
    String publicationYear;
    Boolean availability = true;
    public Book(String title,String author, String publicationYear){
        this.title=title;
        this.author=author;
        this.publicationYear=publicationYear;
    }
    public String getDescription(){
        return this.title +" | "+this.author+" | "+this.publicationYear;
    }
}
