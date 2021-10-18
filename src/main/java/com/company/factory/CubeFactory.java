package com.company.factory;

import com.company.figure.Cube;
import com.company.figure.CubeParts;


public interface CubeFactory {
    Cube CreateCube(CubeParts center, CubeParts rib, int id, int name);
}
