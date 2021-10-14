package com.company.factory.impl;

import com.company.factory.CubePartsFactory;
import com.company.figure.CubeParts;
import com.company.figure.impl.CubePartsRib;

public class CubeRibPartsFactory implements CubePartsFactory {
    @Override
    public CubeParts CreateCubePart(int a) {
        return new CubePartsRib(a);
    }
}
