package designPattern.factoryPattern_1;

public class OperatingFactory {

    public OS getInstance(String typeOfOS) {
        if (typeOfOS == "Open") {
            return new AndroidOS();
        } else if (typeOfOS == "Closed") {
            return new IOS();
        } else {
            return new WindowsOS();
        }
    }
}
