package com.company.shape.observer;

import com.company.shape.figure.Cube;

import java.util.EventObject;

public class CubeEvent extends EventObject {

    public CubeEvent(Cube source) {
        super(source);
    }

    @Override
    public Cube getSource() {
        return (Cube)super.getSource();
    }
}
