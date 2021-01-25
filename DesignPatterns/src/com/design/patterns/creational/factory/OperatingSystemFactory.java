package com.design.patterns.creational.factory;

import com.design.patterns.creational.Ifactory.OS;

public class OperatingSystemFactory {
    // This is the class which gives us object,the factory method is here.
    public OS getInstance(String str) {

        if (str.equals("Open")) {
            return new Android();
        } else if (str.equals("Closed")) {
            return new IOS();
        } else {
            return new Windows();
        }
    }
}
