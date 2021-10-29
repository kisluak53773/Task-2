package com.company.shape.observer.impl;

import com.company.shape.action.impl.MathWithFigureImplementation;
import com.company.shape.factory.CubeFactory;
import com.company.shape.factory.CubePartsFactory;
import com.company.shape.factory.WarehouseFactory;
import com.company.shape.factory.impl.CubeCenterPartsFactory;
import com.company.shape.factory.impl.CubeFactoryImplementation;
import com.company.shape.factory.impl.CubeRibPartsFactory;
import com.company.shape.figure.Cube;
import com.company.shape.observer.CubeEvent;
import com.company.shape.observer.Observer;
import com.company.shape.repository.RepositoryCube;
import com.company.shape.repository.RepositoryWarehouse;
import com.company.shape.warehouse.Warehouse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CubeObserver implements Observer {
    private final static Logger logger= LogManager.getLogger();

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
            rib=center*2;
        }else {
            center=rib/2;
        }
        Cube newCube=cubeFactory.CreateCube(centerFactory.CreateCubePart(center),
                ribFactory.CreateCubePart(rib),id,id);
        Warehouse newWarehouse=warehouseFactory.createWarehouse(id, math.Volume(rib), math.Square(rib),
                math.Perimeter(rib));
        RepositoryCube.set(indexCube,newCube);
        RepositoryWarehouse.set(indexWarehouse,newWarehouse);
    }
}
