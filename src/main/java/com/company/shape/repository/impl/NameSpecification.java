package com.company.shape.repository.impl;

import com.company.shape.figure.Cube;
import com.company.shape.repository.Specification;

public class NameSpecification implements Specification {
    private String subString;

    public NameSpecification(String subString){
        this.subString=subString;
    }

    @Override
    public boolean specify(Cube cube) {
        boolean result=cube.getName().contains(subString);
        return result;
    }
}
