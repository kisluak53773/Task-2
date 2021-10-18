package com.company.repository;

import com.company.warehouse.Warehouse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RepositoryWarehouse {
    private final static RepositoryWarehouse REPOSITORY_WAREHOUSE=new RepositoryWarehouse();
    private static List<Warehouse> warehouses=new ArrayList<>();

    public static boolean add(Warehouse warehouse){
        return warehouses.add(warehouse);
    }

    public static boolean addAll(Collection<? extends Warehouse> warehouseCollection){
        return warehouses.addAll(warehouseCollection);
    }

    public static boolean removeAll(Collection<?> warehouseCollection){
        return warehouses.removeAll(warehouseCollection);
    }

    public static boolean Remove(Warehouse warehouse){
        return warehouses.remove(warehouse);
    }

    public static Warehouse get(int index){
        return warehouses.get(index);
    }

    public static void set(int index,Warehouse newWarehouse){
        warehouses.set(index,newWarehouse);
    }
    
    public static int getIndex(int id){
        int index = 0;
        for(int i=0;i<warehouses.size();i++){
            if(warehouses.get(i).getId()==id){
                index=i;
            }
        }
        return index;
    }
}
