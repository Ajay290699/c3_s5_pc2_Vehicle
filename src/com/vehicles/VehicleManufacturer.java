package com.vehicles;

public abstract class VehicleManufacturer {
    private String vehicleName;
    private String vehicleModelNo;
    private String vehicleType;

    public VehicleManufacturer(String vehicleName, String vehicleModelNo, String vehicleType) {
        this.vehicleName = vehicleName;
        this.vehicleModelNo = vehicleModelNo;
        this.vehicleType = vehicleType;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleModelNo() {
        return vehicleModelNo;
    }

    public void setVehicleModelNo(String vehicleModelNo) {
        this.vehicleModelNo = vehicleModelNo;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public abstract String getManufacturerInformation();

}
