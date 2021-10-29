package com.company.shape.repository;

import com.company.shape.figure.Cube;

public interface Specification {
    boolean specify(Cube cube);
}
