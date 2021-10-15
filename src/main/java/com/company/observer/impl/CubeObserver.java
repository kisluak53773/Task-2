package com.company.observer.impl;

import com.company.figure.Cube;
import com.company.observer.CubeEvent;
import com.company.observer.Observer;

public class CubeObserver implements Observer {
    @Override
    public void ParameterChanged(CubeEvent event) {
        Cube cube=event.getSource();
    }
}
