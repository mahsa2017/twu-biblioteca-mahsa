package com.twu.biblioteca;


public class Admin {
    private Printer printer;

    public Admin(Printer printer){
        this.printer = printer;
    }
    public Boolean login(User[] users, String libraryNum,String passWord){
        Boolean loggedIn = false;
        for(User item: users){
    if(item.getLibraryNum().equals(libraryNum)){
        if(item.getPassword().equals(passWord) ){ //ea
            loggedIn = true;
        }
    }
    if(libraryNum == null ){
    printer.print("No user found");
    }
}
        return loggedIn;
    }
}
