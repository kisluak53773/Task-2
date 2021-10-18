package com.company.filler;

import com.company.factory.CubeFactory;
import com.company.factory.CubePartsFactory;
import com.company.factory.impl.CubeCenterPartsFactory;
import com.company.factory.impl.CubeFactoryImplementation;
import com.company.factory.impl.CubeRibPartsFactory;
import com.company.figure.Cube;
import com.company.repository.RepositoryCube;
import org.testng.annotations.Test;

import java.net.URISyntaxException;

import static org.testng.Assert.*;

public class RepositoryFillerTest {

    @Test
    public void testFill() throws URISyntaxException {
        RepositoryFiller filler=new RepositoryFiller();
        CubeFactory cubeFactory=new CubeFactoryImplementation();
        CubePartsFactory centerFactory=new CubeCenterPartsFactory();
        CubePartsFactory ribFactory=new CubeRibPartsFactory();
        filler.Fill(Thread.currentThread().getContextClassLoader().getResource("data/test2.txt").toURI());
        Cube actual= RepositoryCube.get(0);
        Cube expected=cubeFactory.CreateCube(centerFactory.CreateCubePart(9),
                ribFactory.CreateCubePart(18), 1,1);
        assertEquals(actual,expected);
    }
}