package JVM;

/**
 * For every loaded .class file, only one class Class object will create by jvm, even though we are using that class multiple times in our program
 * Demonstrate above statement
 */
public class Test2 {
    public static void main(String[] args) {
        Student s1=new Student();
        Class c1=s1.getClass();
        Student s2=new Student();
        Class c2=s2.getClass();

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1==c2);
    }
}

