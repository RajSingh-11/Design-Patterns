package com.design.patterns.creational.factory;

import com.design.patterns.creational.Ifactory.OS;

public class Android implements OS{

    @Override
    public void spec() {
 
        System.out.println("Most powerful OS");
    }

}
