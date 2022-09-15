package Serailization.externalizableDemo;

import java.io.*;

public class ExternalizeDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ExternalizeExample ex=new ExternalizeExample("shubham",1,3);
        FileOutputStream fos=new FileOutputStream("ex.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(ex);

        FileInputStream fis=new FileInputStream("ex.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        ExternalizeExample ex2= (ExternalizeExample) ois.readObject();
        System.out.println(ex2.s+" "+ex2.i);
    }
}
