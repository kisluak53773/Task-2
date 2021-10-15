package com.company.warehouse;

public class Warehouse {
    private int id;
    private int volume;
    private int square;
    private int perimeter;

    public Warehouse(int id, int volume, int square, int perimeter) {
        this.id = id;
        this.volume = volume;
        this.square = square;
        this.perimeter = perimeter;
    }

    public int getId() {
        return id;
    }

    public int getVolume() {
        return volume;
    }

    public int getSquare() {
        return square;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }
}
