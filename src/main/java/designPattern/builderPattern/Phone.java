package designPattern.builderPattern;

public class Phone {
    private String OS;
    private int ram;
    private double screenSize;
    private int battery;

    public Phone(String OS, int ram, double screenSize, int battery) {
        this.OS = OS;
        this.ram = ram;
        this.screenSize = screenSize;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "OS='" + OS + '\'' +
                ", ram=" + ram +
                ", screenSize=" + screenSize +
                ", battery=" + battery +
                '}';
    }
}
