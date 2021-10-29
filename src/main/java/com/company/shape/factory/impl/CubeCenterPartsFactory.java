package com.company.shape.factory.impl;

import com.company.shape.factory.CubePartsFactory;
import com.company.shape.figure.CubeParts;
import com.company.shape.figure.impl.CubePartsCenter;

public class CubeCenterPartsFactory implements CubePartsFactory {
    @Override
    public CubeParts CreateCubePart(int a) {

        return new CubePartsCenter(a);
    }
}
