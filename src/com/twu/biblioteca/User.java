package com.twu.biblioteca;

public class User {
    private String libraryNum;
    private String password;
    private String name;
    private String email;
    private String phoneNum;

    public User(String libraryNum,String password, String name,String email,String phoneNum){
        this.libraryNum=libraryNum;
        this.password=password;
        this.name=name;
        this.email=email;
        this.phoneNum=phoneNum;
    }
public String getUserInfo(){
        return this.name+" | "+this.email+ " | "+this.phoneNum;
}

    public String getLibraryNum() {
        return libraryNum;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}
