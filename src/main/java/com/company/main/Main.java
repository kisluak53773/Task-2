package com.company.main;

import com.company.factory.CubeFactory;
import com.company.factory.CubePartsFactory;
import com.company.factory.impl.CubeCenterPartsFactory;
import com.company.factory.impl.CubeFactoryImplementation;
import com.company.factory.impl.CubeRibPartsFactory;
import com.company.figure.Cube;
import com.company.filereader.ReadFromFile;
import com.company.filler.RepositoryFiller;
import com.company.repository.RepositoryCube;
import com.company.repository.RepositoryWarehouse;
import com.company.warehouse.Warehouse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.URISyntaxException;
import java.util.List;

public class Main {
    private final static Logger logger= LogManager.getLogger();
    public static void main(String[] args) throws URISyntaxException {
        RepositoryFiller filler=new RepositoryFiller();
        CubePartsFactory centerFactory=new CubeCenterPartsFactory();
        CubePartsFactory ribFactory=new CubeRibPartsFactory();
        CubeFactory cubeFactory=new CubeFactoryImplementation();
        filler.Fill(Thread.currentThread().getContextClassLoader().getResource("data/test2.txt").toURI());
        RepositoryCube.get(0).setCenter(10);
        Cube expected1=cubeFactory.CreateCube(centerFactory.CreateCubePart(10),
                ribFactory.CreateCubePart(20),1,1);
        RepositoryCube.get(0).equals(expected1);
        logger.info(expected1.getName().equals(RepositoryCube.get(0).getName()));
    }
}
