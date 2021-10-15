package com.company.figure.impl;

import com.company.figure.Cube;
import com.company.figure.CubeParts;

public class CubePartsCenter implements CubeParts {
    private int center;

    public CubePartsCenter(){
    }

    public CubePartsCenter( int center){
        this.center=center;
    }

    @Override
    public void setNumber(int i){
        this.center=i;
    }

    @Override
    public int getNumber() {
        return center;
    }

    @Override
    public String toString() {
        return String.valueOf(center);
    }

    @Override
    public int hashCode() {
        int hash=7;
        hash=hash*31+center;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result=true;
        if(Integer.compare(Integer.valueOf((Integer) obj),center)!=0) result=false;
        return result;
    }

}
