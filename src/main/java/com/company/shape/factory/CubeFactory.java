package com.company.shape.factory;

import com.company.shape.figure.Cube;
import com.company.shape.figure.CubeParts;


public interface CubeFactory {
    Cube CreateCube(CubeParts center, CubeParts rib, int id, int name);
}
