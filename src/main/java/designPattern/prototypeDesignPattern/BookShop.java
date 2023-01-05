package designPattern.prototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop {
    private String shopName;
    private List<Book> listOfBooks=new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getListOfBooks() {
        return listOfBooks;
    }

    public void setListOfBooks(List<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", listOfBooks=" + listOfBooks +
                '}';
    }

    /**
     * lets assume data is loading from database
     */
    public void loadData(){
        for(int i=1;i<=10;i++){
            Book b=new Book();
            b.setBookId(i);
            b.setBookName("Book "+i);
            getListOfBooks().add(b);
        }
    }

    @Override
    protected BookShop clone() {
        BookShop shop=new BookShop();
        for(Book b:this.getListOfBooks()){
            shop.getListOfBooks().add(b);
        }
        return shop;
    }
}
