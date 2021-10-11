package com.company.factory.impl;

import com.company.factory.CubeFactory;
import com.company.figure.Cube;
import com.company.figure.impl.CubeRib;

public class CubeRibFactory implements CubeFactory {
    @Override
    public Cube CreateCube(int a) {
        return new CubeRib(a);
    }
}
