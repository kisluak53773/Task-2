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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.URISyntaxException;
import java.util.List;

public class Main {
    private final static Logger logger= LogManager.getLogger();
    public static void main(String[] args) throws URISyntaxException {
        CubeFactory cubeFactory=new CubeFactoryImplementation();
        CubePartsFactory centerFactory=new CubeCenterPartsFactory();
        CubePartsFactory ribFactory=new CubeRibPartsFactory();
        Cube expected=cubeFactory.CreateCube(centerFactory.CreateCubePart(9),
                ribFactory.CreateCubePart(18), 1,1);
        RepositoryCube.add(expected);
    }
}
