package com.company.figure.impl;

import com.company.figure.Cube;

public class CubeRib implements Cube {
    int rib;

    public CubeRib(){
    }

    public CubeRib(int rib){
        this.rib=rib;
    }

    @Override
    public int getNumber() {
        return rib;
    }

    @Override
    public String toString() {
        return String.valueOf(rib);
    }

    @Override
    public boolean equals(Object obj) {
        boolean result;
        if(Integer.compare(Integer.valueOf((Integer) obj),rib)==0){
            result=true;
        }else {
            result=false;
        }
        return result;
    }

}
