package com.twu.biblioteca;

public class Book {
    private String title;
    private String author;
    private String publicationYear;
    private Boolean availability = true;
    public Book(String title,String author, String publicationYear){
        this.title=title;
        this.author=author;
        this.publicationYear=publicationYear;
    }
    public Boolean getAvailabilty(){
        return this.availability;
    }
    public void setAvailabilty(Boolean available){
        this.availability = available;
    }
    public String getTitle() {
        return this.title;
    }
    public String getDescription(){
        return this.title +" | "+this.author+" | "+this.publicationYear;
    }
}
