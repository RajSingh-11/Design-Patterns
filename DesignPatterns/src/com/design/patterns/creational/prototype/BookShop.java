package com.design.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

// This implements cloneable interface becoz we have to make the copy of this
// book shop
public class BookShop implements Cloneable {

    private String shopName;
    List<Book>     books = new ArrayList<Book>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    // suppose this data is coming from data base but right now we have just
    // implemented for our understanding purpose
    public void loadData() {
        for (int i = 0; i < 10; i++) {
            Book b = new Book();
            b.setbId(i);
            b.setName("Book" + i);
            getBooks().add(b);
        }
    }

    @Override
    public String toString() {
        return "BookShop [shopName=" + shopName + ", books=" + books + "]";
    }

    // this is implemented object of Object class.
    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        // this will make the shallow copy of object, which is not required for
        // us. we want deep copy.
        // return (BookShop) super.clone();

        // this will make the deep copy where we copying the data from first
        // object to this bs object.
        BookShop bs = new BookShop();
        for (Book b : this.getBooks()) {
            bs.getBooks().add(b);
        }
        return bs;
    }

}
