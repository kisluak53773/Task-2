package com.company.observer.impl;

import com.company.action.impl.MathWithFigureImplementation;
import com.company.factory.CubeFactory;
import com.company.factory.CubePartsFactory;
import com.company.factory.WarehouseFactory;
import com.company.factory.impl.CubeCenterPartsFactory;
import com.company.factory.impl.CubeFactoryImplementation;
import com.company.factory.impl.CubeRibPartsFactory;
import com.company.figure.Cube;
import com.company.observer.CubeEvent;
import com.company.observer.Observer;
import com.company.repository.RepositoryCube;
import com.company.repository.RepositoryWarehouse;
import com.company.warehouse.Warehouse;

public class CubeObserver implements Observer {
    @Override
    public void ParameterChanged(CubeEvent event) {
        Cube cube=event.getSource();
        WarehouseFactory warehouseFactory=new WarehouseFactory();
        MathWithFigureImplementation math=new MathWithFigureImplementation();
        CubePartsFactory centerFactory=new CubeCenterPartsFactory();
        CubePartsFactory ribFactory=new CubeRibPartsFactory();
        CubeFactory cubeFactory=new CubeFactoryImplementation();
        int id= cube.getId();
        int indexWarehouse= RepositoryWarehouse.getIndex(id);
        int indexCube= RepositoryCube.getIndex(id);
        Cube buffer=RepositoryCube.get(indexCube);
        int rib=cube.getRib().getNumber();
        int center=cube.getCenter().getNumber();
        if(buffer.getCenter().equals(center)){
            center=rib/2;
        }else {
            rib=center*2;
        }
        RepositoryWarehouse.removeById(indexWarehouse);
//        Warehouse newWarehouse=warehouseFactory.createWarehouse(id, rib, math.Square(rib),
//                math.Perimeter(rib));
//        RepositoryCube.set(indexCube,newCube);
//        RepositoryWarehouse.set(indexWarehouse,newWarehouse);
    }
}
