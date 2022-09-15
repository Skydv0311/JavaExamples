package Serailization;

import java.io.*;

class Animal2{
    int i=10;
}

class Elephant2 extends Animal2 implements Serializable{
    int j=20;
}
public class InheritanceSerializedDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Elephant2 e3 = new Elephant2();
        e3.i=999;
        e3.j=888;
        FileOutputStream fos = new FileOutputStream("xyz1.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(e3);

        FileInputStream fis = new FileInputStream("xyz1.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Elephant2 e4 = (Elephant2) ois.readObject();
        System.out.println(e4.i + " " + e4.j);
    }
}
