package com.company.shape.comparison;

import com.company.shape.figure.Cube;

import java.util.Comparator;

public class CompareCenter implements Comparator<Cube> {

    public int compare(Cube o1, Cube o2) {
        return o1.getCenter().getNumber()-o2.getCenter().getNumber();
    }
}
