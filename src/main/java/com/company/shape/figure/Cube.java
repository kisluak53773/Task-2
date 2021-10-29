package com.company.shape.figure;

import com.company.shape.observer.CubeEvent;
import com.company.shape.observer.impl.CubeObserver;

public class Cube {
    private CubeParts CubeCenter;
    private CubeParts CubeRib;
    private int id;
    private String name;
    private CubeObserver observer=new CubeObserver();

    public Cube(CubeParts CubeCenter, CubeParts CubeRib, int id, int name){
        this.CubeCenter=CubeCenter;
        this.CubeRib=CubeRib;
        this.id=id;
        this.name="Cube "+name;
    }
    
    
    public CubeParts getCenter() {
        return CubeCenter;
    }
    
    public CubeParts getRib(){
        return CubeRib;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setCenter(int center){
        this.CubeCenter.setNumber(center);
        notifyObserver();
    }
    
    public void setRib(int rib){
        this.CubeRib.setNumber(rib);
        notifyObserver();
    }
    
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
        int hash=12;
        hash*=CubeCenter.hashCode();
        hash*=CubeRib.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = true;
        if(obj!=null) {
            Cube cube = (Cube) obj;
            if (!CubeCenter.equals(cube.getCenter().getNumber())) result = false;
            if (!CubeRib.equals(cube.getRib().getNumber())) result = false;
            if (!(id == cube.getId())) result = false;
            if (!(name.equals(cube.getName()))) result = false;
        }else result=false;
        return result;
    }

    private void notifyObserver(){
        CubeEvent event=new CubeEvent(this);
        observer.parameterChanged(event);
    }
}
