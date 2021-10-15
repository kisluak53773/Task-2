package com.company.factory;

import com.company.warehouse.Warehouse;

public class WarehouseFactory {
    public Warehouse createWarehouse(int id, int volume, int square, int perimeter){
        return new Warehouse(id,volume,square,perimeter);
    }
}
