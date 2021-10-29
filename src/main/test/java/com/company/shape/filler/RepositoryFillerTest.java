package com.company.shape.filler;

import com.company.shape.factory.CubeFactory;
import com.company.shape.factory.CubePartsFactory;
import com.company.shape.factory.impl.CubeCenterPartsFactory;
import com.company.shape.factory.impl.CubeFactoryImplementation;
import com.company.shape.factory.impl.CubeRibPartsFactory;
import com.company.shape.figure.Cube;
import com.company.shape.repository.RepositoryCube;
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