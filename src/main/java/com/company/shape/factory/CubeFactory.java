package com.company.shape.factory;

import com.company.shape.figure.Cube;
import com.company.shape.figure.CubeParts;


public interface CubeFactory {
    Cube createCube(CubeParts center, CubeParts rib, int id, int name);
}
