package com.serialization;

import java.io.*;
import java.util.ArrayList;

class Admin {
    private String username;
     private String password;

    public Admin(String username,String password){
        this.username=username;
        this.password=password;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}'+"\n";
    }
}


public class SerializedDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Admin admin1 = new Admin("vishal@gmail.com","vishal@12");
        Admin admin2 = new Admin("rahul@gmail.com","rahul@12");
        Admin admin3 = new Admin("suraj@gmail.com","suraj@23");

        FileOutputStream fos = new FileOutputStream("admin.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(admin1);
        oos.writeObject(admin2);
        oos.writeObject(admin3);
        System.out.println("Data Saved into the file in byte code");

        FileInputStream fis = new FileInputStream("admin.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Admin> adminData = new ArrayList<Admin>();
        for (int i=0;i<3;i++){
            Admin admin11 = (Admin) ois.readObject();
            adminData.add(admin11);
        }
        System.out.println(adminData);
    }
}
