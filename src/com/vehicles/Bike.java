package com.vehicles;

public class Bike extends VehicleManufacturer implements Vehicle {

    Bike(String vehicleName, String vehicleModelNo, String vehicleType) {
        super(vehicleName, vehicleModelNo, vehicleType);
    }


    @Override
    public String getManufacturerInformation() {
        return "Bike { Manufacturer Name : " + getVehicleName() + ", Model Name : " + getVehicleModelNo() + " ,Type : " + getVehicleType() + " }";
    }

    @Override
    public int maxSpeed(String vehcileType) {
        if (vehcileType == "sportsBike") {
            return 300;
        } else if (vehcileType == "cruiser") {
            return 170;
        } else {

            return 0;
        }
    }
}
