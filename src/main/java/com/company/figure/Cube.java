package com.company.figure;

public interface Cube {
    CubeParts getCenter();
    CubeParts getRib();
    int getId();
    String getName();
    void setCenter(int center);
    void setRib(int rib);
    void setName(String name);
}
