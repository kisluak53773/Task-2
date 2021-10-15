package com.company.figure.impl;

import com.company.figure.Cube;
import com.company.figure.CubeParts;
import com.company.observer.CubeEvent;
import com.company.observer.impl.CubeObserver;

public class CubeImplementation implements Cube {
    private CubeParts CubeCenter;
    private CubeParts CubeRib;
    private int id;
    private String name;
    private CubeObserver observer=new CubeObserver();

    public CubeImplementation(CubeParts CubeCenter,CubeParts CubeRib,int id,int name){
        this.CubeCenter=CubeCenter;
        this.CubeRib=CubeRib;
        this.id=id;
        this.name="Cube "+name;
    }

    @Override
    public CubeParts getCenter(){
        return CubeCenter;
    }

    @Override
    public CubeParts getRib(){
        return CubeRib;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void setCenter(int center){
        this.CubeCenter.setNumber(center);
        notifyObserver();
    }

    @Override
    public void setRib(int rib){
        this.CubeRib.setNumber(rib);
        notifyObserver();
    }

    @Override
    public void setName(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        String DELIMITER_REGX="\\s";
        StringBuilder sb=new StringBuilder();
        sb.append(CubeCenter.toString()).append(DELIMITER_REGX);
        sb.append(CubeRib.toString()).append(DELIMITER_REGX);
        sb.append(id).append(DELIMITER_REGX);
        sb.append(name).append(DELIMITER_REGX);
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash=7;
        hash=hash*31+CubeCenter.hashCode();
        hash=hash*31+CubeRib.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result=false;
        Cube cube=(Cube) obj;
        if(CubeCenter.equals(cube.getCenter()))result=true;
        if(CubeRib.equals(cube.getRib()))result=true;
        if((id ==cube.getId()))result=true;
        if((name==cube.getName()))result=true;
        return result;
    }

    public void notifyObserver(){
        CubeEvent event=new CubeEvent(this);
        observer.ParameterChanged(event);
    }
}
