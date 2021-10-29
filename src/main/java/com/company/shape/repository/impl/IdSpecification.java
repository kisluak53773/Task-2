package com.company.shape.repository.impl;

import com.company.shape.figure.Cube;
import com.company.shape.repository.Specification;

public class IdSpecification implements Specification {
    private int possibleId;

    public IdSpecification(int possibleId){
        this.possibleId=possibleId;
    }

    @Override
    public boolean specify(Cube cube) {
        int id=cube.getId();
        boolean result=true;
        if(Integer.compare(id,possibleId)!=0)result=false;
        return result;
    }
}
