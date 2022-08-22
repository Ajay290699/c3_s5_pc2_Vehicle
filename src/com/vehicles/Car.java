package com.vehicles;

public class Car extends VehicleManufacturer implements Vehicle {

    Car(String vehicleName, String vehicleModelNo, String vehicleType) {
        super(vehicleName, vehicleModelNo, vehicleType);
    }

    @Override
    public String getManufacturerInformation() {
        return "Car { Manufacturer Name : " + getVehicleName() + ", Model Name : " + getVehicleModelNo() + " Type : " + getVehicleType() + " }";
    }

    @Override
    public int maxSpeed(String vehcileType) {
        if (vehcileType == "sportsCar") {
            return 250;
        } else if (vehcileType == "sedan") {
            return 170;
        } else {
            return 0;
        }
    }
}
