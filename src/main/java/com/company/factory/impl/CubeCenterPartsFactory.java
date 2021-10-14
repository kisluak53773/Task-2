package com.company.factory.impl;

import com.company.factory.CubePartsFactory;
import com.company.figure.CubeParts;
import com.company.figure.impl.CubePartsCenter;

public class CubeCenterPartsFactory implements CubePartsFactory {
    @Override
    public CubeParts CreateCubePart(int a) {

        return new CubePartsCenter(a);
    }
}
