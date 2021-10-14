package com.company.repository.impl;

import com.company.figure.Cube;
import com.company.repository.Specification;

public class RibSpecification implements Specification {
    private int possibleRib;

    public RibSpecification(int possibleRib){
        this.possibleRib=possibleRib;
    }

    @Override
    public boolean specify(Cube cube) {
        boolean result=cube.getRib().equals(possibleRib);
        return result;
    }
}
