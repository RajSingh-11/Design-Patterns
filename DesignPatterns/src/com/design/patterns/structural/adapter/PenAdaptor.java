package com.design.patterns.structural.adapter;

public class PenAdaptor implements Pen {

    PilotPen pilotPen = new PilotPen();

    @Override
    public void write(String str) {
        pilotPen.mark(str);
    }

}
