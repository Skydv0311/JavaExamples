package Serailization.serialVersionUIDEx;

import java.io.*;

public class Sender {

    public static void main(String[] args) throws IOException {
        Sample sample=new Sample();
        FileOutputStream fos=new FileOutputStream("sample.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(sample);
    }
}
