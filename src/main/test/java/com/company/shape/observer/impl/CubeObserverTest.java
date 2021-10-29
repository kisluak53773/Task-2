package com.company.shape.observer.impl;

import com.company.shape.factory.CubeFactory;
import com.company.shape.factory.CubePartsFactory;
import com.company.shape.factory.impl.CubeCenterPartsFactory;
import com.company.shape.factory.impl.CubeFactoryImplementation;
import com.company.shape.factory.impl.CubeRibPartsFactory;
import com.company.shape.figure.Cube;
import com.company.shape.filler.RepositoryFiller;
import com.company.shape.repository.RepositoryCube;
import com.company.shape.repository.RepositoryWarehouse;
import com.company.shape.warehouse.Warehouse;
import org.testng.annotations.Test;

import java.net.URISyntaxException;

import static org.testng.Assert.*;

public class CubeObserverTest {

    @Test
    public void testParameterChanged() throws URISyntaxException {
        RepositoryFiller filler=new RepositoryFiller();
        CubePartsFactory centerFactory=new CubeCenterPartsFactory();
        CubePartsFactory ribFactory=new CubeRibPartsFactory();
        CubeFactory cubeFactory=new CubeFactoryImplementation();
        filler.fill(Thread.currentThread().getContextClassLoader().getResource("data/test2.txt").toURI());
        RepositoryCube.get(0).setCenter(10);
        Cube actual=RepositoryCube.get(0);
        Cube expected=cubeFactory.createCube(centerFactory.createCubePart(10),
                ribFactory.createCubePart(20),1,1);
        assertEquals(actual,expected);
    }
    @Test
    public void testParameterChanged2() throws URISyntaxException {
        RepositoryFiller filler=new RepositoryFiller();
        filler.fill(Thread.currentThread().getContextClassLoader().getResource("data/test2.txt").toURI());
        RepositoryCube.get(0).getCenter().setNumber(10);
        Warehouse actual= RepositoryWarehouse.get(0);
        Warehouse expected=new Warehouse(1, 8000, 2400, 240);
        assertEquals(actual,actual);
    }
}