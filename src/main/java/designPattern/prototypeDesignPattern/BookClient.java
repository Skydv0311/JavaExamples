package designPattern.prototypeDesignPattern;

public class BookClient {

    public static void main(String[] args) {

        BookShop bs=new BookShop();
        bs.setShopName("A1");
        bs.loadData();

        BookShop bs1=bs.clone();
        bs.getListOfBooks().remove(2);
        bs1.setShopName("A2");

        System.out.println(bs);
        System.out.println(bs1);
    }
}
