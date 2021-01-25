package com.design.patterns.creational.factory;

import com.design.patterns.creational.Ifactory.OS;

/**
 * desing pattern are solution for OOP problems, principle of oop is
 * 
 * 1. prefer composition over inheritance
 * 
 * 2. code for interface not for implementation
 * 
 * Depends on these two principles they have desingn patterns. Types of design
 * patterns- 1. Creational - when we want an object, how to get that object then
 * we follow creational design patterns.
 * 
 * 2. Structural- compose an object let's say you have an object you want an
 * object inside that object then we should go for structural design pattern.
 * Object Car has object Engine.
 * 
 * 3. Behavioural - Let's say you have two object you do not want to compose an
 * object , you want to communicate between these two objects, then we should
 * follow behavioural design pattens.
 * 
 *
 * we have 23 basic design patterns. according to requirement we have to use
 * design pattern.
 * 
 * ##creational-5
 * 
 * 1. singleton 2.factory 3.abstract factory 4. Builder 5.prototype
 * 
 * ##structural - 7
 * 
 * 1. Adaptor 2. composite 3. proxy 4. fly weight 5. facade 6. bridge
 * 7.decorator
 * 
 * 
 * 
 * ##Behavioural -11
 * 
 * 1. Template method 2. mediator 3. chain of responsibility 4. observer 5.
 * strategy 6. command 7.state 8. visitor 9. iterator 10. interpreter 11.memento
 */

// Factory design pattern - Example we are taking of OS(operating system)

public class FactoryMain {

    public static void main(String[] args) {
        // Here we are creating object of Android in future if we need object of
        // Android we have to change here , which is not a good way to write
        // here so we have used one design pattern which is factory design
        // pattern

        // In factory design pattern we make one class which gives us the object
        // of Android, IOS and windows depending on the requirement. if we pass
        // string "Open" it will create android object,if we pass "Closed", it
        // will create object of IOS, if nothing it will create object of
        // Windows.

        // we are hiding the details of implementation from user.

        // OS obj = new Android();
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("Open");
        obj.spec();
    }
}
