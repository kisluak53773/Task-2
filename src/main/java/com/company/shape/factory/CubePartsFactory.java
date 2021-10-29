package com.company.shape.factory;

import com.company.shape.figure.CubeParts;

public interface CubePartsFactory {
    CubeParts createCubePart(int a);
}
