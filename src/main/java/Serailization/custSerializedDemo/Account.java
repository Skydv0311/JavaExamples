package Serailization.custSerializedDemo;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable {
    String username="Shubham";
    transient String password="abcd";

    transient int pin=123;

    private void writeObject(ObjectOutputStream oos) throws Exception{
        oos.defaultWriteObject();
        String epwd="123"+password;
        oos.writeObject(epwd);
        int epin=444+pin;
        oos.writeObject(epin);
    }

    private void readObject(ObjectInputStream ois) throws Exception{
        ois.defaultReadObject();
        String epwd= (String) ois.readObject();
        password=epwd.substring(3);
        int epin= (int) ois.readObject();
        pin=epin-444;
    }
}
