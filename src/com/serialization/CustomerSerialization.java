package com.serialization;
import java.io.*;
class Account implements Serializable {
    String userName = "Vishal Panwar";
    transient String password = "vishal@15";

    private void writeObject(ObjectOutputStream oos) throws Exception{
        oos.defaultWriteObject();
        String pwd = "123"+password;
        oos.writeObject(pwd);
    }
    private void readObject(ObjectInputStream ois) throws Exception{
        ois.defaultReadObject();
        String pwd = (String)ois.readObject();
        password = pwd.substring(3);
    }

    @Override
    public String toString() {
        return "Account{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

public class CustomerSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Account a1 = new Account();
        FileOutputStream fos = new FileOutputStream("account.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a1);

        FileInputStream fis = new FileInputStream("account.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Account a2 = (Account)ois.readObject();

        System.out.println(a2);
    }
}
