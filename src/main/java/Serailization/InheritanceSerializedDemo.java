package Serailization;

import java.io.*;

class Animal implements Serializable{
    int i=10;
}

class Elephant extends Animal{
    int j=20;
}
public class InheritanceSerializedDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Elephant e1 = new Elephant();
        FileOutputStream fos = new FileOutputStream("xyz.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(e1);

        FileInputStream fis = new FileInputStream("xyz.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Elephant e2 = (Elephant) ois.readObject();
        System.out.println(e2.i + " " + e2.j);
    }
}
