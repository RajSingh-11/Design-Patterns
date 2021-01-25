package com.design.patterns.creational.builder;

public class Shop {
    // suppose we want to build a phone or assembled computer, and phone has
    // different- different
    // properties and we don't want all of them, we want some particular
    // properties like we want phone which has better processor, battery,os,so
    // for that we have to pass all the fields value in the constructor. but i
    // don't want to set all the parameters

    // So here the problem is -

    // 1) we have to set all the parameter
    // 2) we have to remember the sequence of the parameter of the constructor.

    // so solve the above problems we have used builder design pattern

    // we can take coka-cola bottle example like first we have raw bottle, then
    // we fill up with drink then we label that. means we have an object and we
    // do the changes on that and finally get the same object output. it is like
    // we assemble the computer for personal use.

    public static void main(String[] args) {
        // here we are providing the parameter and we have to remember the
        // sequence of the parameter, so to remove this dependency, we have
        // used builder pattern.
        /**
         * Phone phone = new Phone("Android", "Qualcomm", "5.2", 4000Mah, 12);
         * System.out.println(phone);
         */

        // PhoneBuilder pb = new PhoneBuilder();

        // the advantage of builder pattern is we can set the value according to
        // our need and we don't have to remember the sequence of the
        // parameters here.
        /*
         * pb.setOs("Android"); pb.setProcessor("Qualcomm"); pb.setCamera(20);
         * pb.setBattery(4000); pb.setScrrenSize("5.2"); Phone phone =
         * pb.getPhone();
         */

        // or we can set like, here we don't have to remember the sequence or
        // order.
        Phone phone = new PhoneBuilder().setBattery(4000).setProcessor("Qualcomm").setOs("Android").getPhone();

        System.out.println(phone);
    }

}
