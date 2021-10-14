package com.company.figure.impl;

import com.company.figure.CubeParts;

public class CubePartsRib implements CubeParts {
    int rib;

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
        int hash=7;
        hash=hash*31+rib;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result=true;
        if(Integer.compare(Integer.valueOf((Integer) obj),rib)!=0) result=false;
        return result;
    }

}
