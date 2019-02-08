package com.twu.biblioteca;

public class Book {
    String title;
    String author;
    public Book(String title,String author){
        this.title=title;
        this.author=author;
    }
    public String getDescription(){
        return "This book's name is " + this.title +" written by "+this.author;
    }
}
