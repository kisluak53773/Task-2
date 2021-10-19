package com.company.observer.impl;

import com.company.factory.CubeFactory;
import com.company.factory.CubePartsFactory;
import com.company.factory.impl.CubeCenterPartsFactory;
import com.company.factory.impl.CubeFactoryImplementation;
import com.company.factory.impl.CubeRibPartsFactory;
import com.company.figure.Cube;
import com.company.filler.RepositoryFiller;
import com.company.repository.RepositoryCube;
import com.company.repository.RepositoryWarehouse;
import com.company.warehouse.Warehouse;
import org.testng.annotations.Test;

import java.net.URISyntaxException;

import static org.testng.Assert.*;

public class CubeObserverTest {

    @Test
    public void testParameterChanged() throws URISyntaxException {
        RepositoryFiller filler=new RepositoryFiller();
        CubeFactory cubeFactory=new CubeFactoryImplementation();
        CubePartsFactory centerFactory=new CubeCenterPartsFactory();
        CubePartsFactory ribFactory=new CubeRibPartsFactory();
        filler.Fill(Thread.currentThread().getContextClassLoader().getResource("data/test2.txt").toURI());
        RepositoryCube.get(0).getCenter().setNumber(10);
        Cube actual=RepositoryCube.get(0);
        Cube expected=cubeFactory.CreateCube(centerFactory.CreateCubePart(10),
                ribFactory.CreateCubePart(20), 1,1);
        assertEquals(actual,expected);
    }
    @Test
    public void testParameterChanged2() throws URISyntaxException {
        RepositoryFiller filler=new RepositoryFiller();
        filler.Fill(Thread.currentThread().getContextClassLoader().getResource("data/test2.txt").toURI());
        RepositoryCube.get(0).getCenter().setNumber(10);
        Warehouse actual= RepositoryWarehouse.get(0);
        Warehouse expected=new Warehouse(1, 8000, 2400, 240);
        assertEquals(actual,expected);
    }

}