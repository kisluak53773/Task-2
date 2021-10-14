package com.company.factory.impl;

import com.company.factory.CubeFactory;
import com.company.figure.Cube;
import com.company.figure.CubeParts;
import com.company.figure.impl.CubeImplementation;

public class CubeFactoryImplementation implements CubeFactory {
    @Override
    public Cube CreateCube(CubeParts center, CubeParts rib, int id, int name) {
        return new CubeImplementation(center,rib,id,name);
    }
}
