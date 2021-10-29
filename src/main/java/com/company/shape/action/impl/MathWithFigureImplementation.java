package com.company.shape.action.impl;

import com.company.shape.action.MathWithFigure;

public class MathWithFigureImplementation implements MathWithFigure {
    @Override
    public int Volume(int a) {
        return (int) Math.pow(a,3);
    }

    @Override
    public int Square(int a) {
        return (a*a)*6;
    }

    @Override
    public int Perimeter(int a) {
        return a*12;
    }
}
