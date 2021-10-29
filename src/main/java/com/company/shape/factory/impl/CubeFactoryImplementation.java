package com.company.shape.factory.impl;

import com.company.shape.factory.CubeFactory;
import com.company.shape.figure.CubeParts;
import com.company.shape.figure.Cube;

public class CubeFactoryImplementation implements CubeFactory {


    @Override
    public Cube CreateCube(CubeParts center, CubeParts rib, int id, int name) {
        return new Cube(center,rib,id,name);
    }
}
