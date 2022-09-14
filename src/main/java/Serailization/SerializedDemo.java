package Serailization;

import java.io.*;

class Dog implements Serializable{
    int i=10;
    transient int j=20; // if we declare variable as transient then jvm ignore the original value and save default value in file.
//    static int j=20; // static variable are not part object and hence won't participate in serialization.

}
public class SerializedDemo{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dog d1=new Dog();
        /**
         * Serialization
         */
        FileOutputStream fout=new FileOutputStream("abc.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fout);
        oos.writeObject(d1);

        /**
         * Deserialization
         */
        FileInputStream fin=new FileInputStream("abc.txt");
        ObjectInputStream ois=new ObjectInputStream(fin);
        Dog d2=(Dog)ois.readObject();

        System.out.println(d2.i+" "+d2.j);

    }
}
