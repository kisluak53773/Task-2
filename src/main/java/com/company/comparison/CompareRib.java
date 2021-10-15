package com.company.comparison;

import com.company.figure.Cube;

import java.util.Comparator;

public class CompareRib implements Comparator<Cube> {
    @Override
    public int compare(Cube o1, Cube o2) {
        return o1.getRib().getNumber()-o2.getRib().getNumber();
    }
}
