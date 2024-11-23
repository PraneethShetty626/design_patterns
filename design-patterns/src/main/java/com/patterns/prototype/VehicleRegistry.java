package com.patterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class VehicleRegistry {
    private static Map<String,Vehicle> vehicleMap = new HashMap<>();
    static {
        vehicleMap.put("TWO", new TwoWheelerVehicle("120","v1",124l,false));
        vehicleMap.put("FOUR", new FourWheelerVehicle("500","v3", 2343l,false,false));
    }

    public Vehicle getVehicle(String vehicle) throws CloneNotSupportedException {
     return vehicleMap.get(vehicle).clone();
    }
}
