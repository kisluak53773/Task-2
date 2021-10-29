package com.company.shape.factory;

import com.company.shape.warehouse.Warehouse;

public class WarehouseFactory {
    public Warehouse createWarehouse(int id, int volume, int square, int perimeter){
        return new Warehouse(id,volume,square,perimeter);
    }
}
