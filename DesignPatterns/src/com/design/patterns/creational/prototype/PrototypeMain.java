package com.design.patterns.creational.prototype;

// when you create an object it takes more times for example if we create object
// from data base values
// it load from data base first and then we create an object, so next time when
// we want another object we do not hit the data base again
// we just copy or can say clone the object from first object.

// Example- if we have a book shop and we want to open another book shop so what
// we can do is we just clone the book shop where same books will be there.

/**
 * The is achieved by Cloneable(marker) interface where we make the clone of
 * Book Shop, by default java gives us shallow copy in which if we change in
 * first object it changes it in the second object also, means two references
 * pointing to same address in the memory. To avoid this we do deep cloning
 * where we create new object of Book Shop and copy every value of book shop
 * object to this new object, this will not affect the second object even if we
 * delete something from the first object.
 */

public class PrototypeMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bShop = new BookShop();
        bShop.setShopName("Novelity");
        bShop.loadData();
        // instead loading the second object form database we do deep cloning of
        // object.
        BookShop b1 = bShop.clone();
        // this will remove from both objects if it is shallow copy but here we
        // have done deep copy so it will not remove from second object.
        bShop.getBooks().remove(2);
        b1.setShopName("A1");
        System.out.println(bShop);
        System.out.println(b1);

    }
}
