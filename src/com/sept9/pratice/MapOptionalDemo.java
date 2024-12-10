package com.sept9.pratice;

import org.w3c.dom.ls.LSOutput;

import java.util.Optional;
import java.util.Scanner;

class User{
    private String name;
    private String email;


    public User(String name,String email){
        this.name = name;
        this.email = email;
    }
    public Optional<String> getMail(){
        return Optional.ofNullable(email);
    }

}
public class MapOptionalDemo {

    public static void main(String[] args) {
        User user1 = new User("Vishal","vishal@gmail.com");
        Optional<String> email1 = user1.getMail();
        Optional<String> upperCase = email1.map(s->s.toUpperCase());
        System.out.println(upperCase.orElse("No email found"));
        User user2 = new User("Rahul",null);
        Optional<String> email2 = user2.getMail();
        System.out.println(email2.orElse("defualt gmail"));
    }
}
