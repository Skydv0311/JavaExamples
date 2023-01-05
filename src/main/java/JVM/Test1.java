package JVM;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * How to read Class object binary data created by jvm in heap area after reading binary data from method area
 */

class Student{
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
public class Test1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c=Class.forName("JVM.Student");
        Method[] m=c.getDeclaredMethods();
        for (Method m1:m){
            System.out.println(m1);
        }
        System.out.println("==========================================================");

        Field[] f=c.getDeclaredFields();
        for (Field f1:f){
            System.out.println(f1);
        }

    }
}
