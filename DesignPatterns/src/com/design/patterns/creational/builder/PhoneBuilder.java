package com.design.patterns.creational.builder;

public class PhoneBuilder {
    // in every setter it returns the object of PhoneBuilder itself, that's why
    // there is return this statement.
    private String os;
    private String processor;
    private String scrrenSize;
    private int    battery;
    private int    camera;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;// return same object here
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setScrrenSize(String scrrenSize) {
        this.scrrenSize = scrrenSize;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setCamera(int camera) {
        this.camera = camera;
        return this;
    }

    // this gives us the object of Phone, here we don't have to remember the
    // sequence of the parameter.
    public Phone getPhone() {
        return new Phone(os, processor, scrrenSize, battery, camera);
    }
}
