package com.design.patterns.creational.builder;

public class Phone {

    private String os;
    private String processor;
    private String scrrenSize;
    private int battery;
    private int camera;

    /**
     * @param os
     * @param processor
     * @param scrrenSize
     * @param battery
     * @param camera
     */
    public Phone(String os, String processor, String scrrenSize, int battery, int camera) {
        super();
        this.os = os;
        this.processor = processor;
        this.scrrenSize = scrrenSize;
        this.battery = battery;
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Phone [os=" + os + ", processor=" + processor + ", scrrenSize=" + scrrenSize + ", battery=" + battery
                + ", camera=" + camera + "]";
    }

}
