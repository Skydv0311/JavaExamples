package designPattern.builderPattern;

/**
 * Builder design pattern - Creational Design patter
 */
public class Shop {

    public static void main(String[] args) {
        Phone phone=new PhoneBuilder().setOS("Android").setBattery(3000).getPhone();
        System.out.println(phone);
        phone=new PhoneBuilder().setOS("IOS").setRam(2).getPhone();
        System.out.println(phone);
    }

}
