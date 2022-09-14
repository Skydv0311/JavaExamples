package Serailization.custSerializedDemo;

import java.io.*;

public class CustSerializedDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Account a1=new Account();
        FileOutputStream fos=new FileOutputStream("account.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(a1);

        FileInputStream fis=new FileInputStream("account.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Account a2= (Account) ois.readObject();

        System.out.println(a2.username+" "+a2.password+" "+ a2.pin);
    }

}


