package com.company.shape.action.impl;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MathWithFigureImplementationTest {

    @Test
    public void testVolume() {
        MathWithFigureImplementation math=new MathWithFigureImplementation();
        int actual=math.Volume(10);
        int expected=1000;
        assertEquals(actual,expected);
    }

    @Test
    public void testSquare() {
        MathWithFigureImplementation math=new MathWithFigureImplementation();
        int actual= math.Square(10);
        int expected=600;
        assertEquals(actual,expected);
    }

    @Test
    public void testPerimeter() {
        MathWithFigureImplementation math=new MathWithFigureImplementation();
        int actual=math.Perimeter(10);
        int expected=120;
        assertEquals(actual,expected);
    }
}