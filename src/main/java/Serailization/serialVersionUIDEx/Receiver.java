package Serailization.serialVersionUIDEx;

import java.io.*;

public class Receiver {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream("sample.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Sample sample1= (Sample) ois.readObject();

        System.out.println(sample1.i+" "+sample1.j);
    }
}
