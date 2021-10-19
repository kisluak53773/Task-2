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
        int center=10;
        int rib=20;
        int id=1;
        filler.Fill(Thread.currentThread().getContextClassLoader().getResource("data/test2.txt").toURI());
//        RepositoryCube.get(0).getCenter().setNumber(10);
//        Warehouse ware=RepositoryWarehouse.get(0);
//        logger.info(ware.getVolume());
//        Cube buffer=RepositoryCube.get(0);
//        if(buffer.getCenter().equals(10)){
//            center=rib/2;
//        }else {
//            rib=center*2;
//        }
//        logger.info(rib);
    }
}
