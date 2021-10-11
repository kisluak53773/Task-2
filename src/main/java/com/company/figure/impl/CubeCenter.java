package com.company.figure.impl;

import com.company.figure.Cube;

public class CubeCenter implements Cube {
    int center;

    public CubeCenter(){
    }

    public CubeCenter(int center){
        this.center=center;
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
    public boolean equals(Object obj) {
        boolean result;
        if(Integer.compare(Integer.valueOf((Integer) obj),center)==0){
            result=true;
        }else {
            result=false;
        }
        return result;
    }

}
