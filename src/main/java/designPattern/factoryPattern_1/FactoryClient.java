package designPattern.factoryPattern_1;

public class FactoryClient {
    public static void main(String[] args) {
        OS os;
        OperatingFactory operatingFactory=new OperatingFactory();
        os=operatingFactory.getInstance("Open");
        os.spec();
        os=operatingFactory.getInstance("Closed");
        os.spec();
        os=operatingFactory.getInstance("Old");
        os.spec();
    }
}
