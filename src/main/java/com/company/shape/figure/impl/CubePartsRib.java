package com.company.shape.figure.impl;

import com.company.shape.figure.CubeParts;
import com.company.shape.figure.CubeParts;

public class CubePartsRib implements CubeParts {
    private int rib;

    public CubePartsRib(){
    }

    public CubePartsRib(int rib){
        this.rib=rib;
    }

    @Override
    public void setNumber(int i){
         this.rib=i;
    }

    @Override
    public int getNumber() {
        return rib;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append(rib);
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash=12;
        hash*=rib;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result=true;
        if(obj!=null) {
            if (Integer.compare(Integer.valueOf((Integer) obj), rib) != 0) result = false;
        }else result=false;
        return result;
    }

}
