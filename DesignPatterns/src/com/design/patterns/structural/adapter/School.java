package com.design.patterns.structural.adapter;

// This is the structural design pattern. Adapter design pattern provides the
// adapter between two different classes and two different interfaces.
// it is like we have to charge the iphone5 from iphone4 charger , it is
// possible only by adapter

// We require pen but I have the implementation of pilot pen, so i can use the
// implementation of pilot pen instead of pen using adapter design pattern
// because directly we can not do that.

// here pen is the interface and pilot pen is the class, so we have to make a
// way to communicate between them. so we will have pen adaptor which will take
// pilot pen object and return the pen object. The Pen adaptor implements the
// pen
// interface and has the Pilot Pen object through which it calls the mark method
// of pilot pen.

// suppose my friend has given me the pilot pen implementation but i have pen so
// i want to use the pilot pen we need something to communicate between two that
// is called adaptor. Suppose we don't have the source code of this PilotPen
// class, we
// have the
// .class file of PilotPen.
public class School {

    public static void main(String[] args) {
        // PilotPen pp = new PilotPen();
        // we have to do new assignment so we create an object of AssignmentWork

        // AssignmentWork has the Pen which is an
        // interface that's why we made a class
        // which implements the pen interface and
        // call the mark method of pilot pen.

        AssignmentWork assgnWork = new AssignmentWork();
        // Pen p = new Pen(); //this is not possible because Pen is an
        // interface.
        Pen p = new PenAdaptor();
        // we can not directly pass the object of PilotPen,that's why we have an
        // adaptor class which has pilot pen.
        assgnWork.setP(p);
        assgnWork.writeAssignment("I am bit tired to write an assignment");
    }

}
