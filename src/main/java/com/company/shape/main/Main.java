package com.company.shape.main;

import com.company.shape.factory.CubeFactory;
import com.company.shape.factory.CubePartsFactory;
import com.company.shape.factory.impl.CubeCenterPartsFactory;
import com.company.shape.factory.impl.CubeFactoryImplementation;
import com.company.shape.factory.impl.CubeRibPartsFactory;
import com.company.shape.figure.Cube;
import com.company.shape.filler.RepositoryFiller;
import com.company.shape.repository.RepositoryCube;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.URISyntaxException;

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
