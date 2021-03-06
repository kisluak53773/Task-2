package com.company.shape.repository.impl;

import com.company.shape.figure.Cube;
import com.company.shape.repository.Specification;

public class CenterSpecification implements Specification {
    private int possibleCenter;

    public CenterSpecification(int possibleCenter){
        this.possibleCenter=possibleCenter;
    }

    @Override
    public boolean specify(Cube cube) {
        boolean result=cube.getCenter().equals(possibleCenter);
        return result;
    }
}
