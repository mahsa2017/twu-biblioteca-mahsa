package com.twu.biblioteca;

public class Movie {
    String name;
    int year;
    String director;
    int rating;//1-10 or unrated?
    public Movie(String name,Integer year,String director,int rating){
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }
    public String getDescription() {
        return this.name+" | "+this.year+" | "+this.director+" | "+this.rating;
    }
}
