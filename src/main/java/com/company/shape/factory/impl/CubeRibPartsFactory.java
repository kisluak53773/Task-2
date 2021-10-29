package com.company.shape.factory.impl;

import com.company.shape.factory.CubePartsFactory;
import com.company.shape.figure.CubeParts;
import com.company.shape.figure.impl.CubePartsRib;

public class CubeRibPartsFactory implements CubePartsFactory {
    @Override
    public CubeParts createCubePart(int a) {
        return new CubePartsRib(a);
    }
}
