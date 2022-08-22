package com.vehicles;

public class VehicleService {
    public static void main(String[] args) {
        Bike bike = new Bike("Yamaha", "R15", "sportsBike");
        bike.maxSpeed(bike.getVehicleType());
        bike.getManufacturerInformation();
        System.out.println("Bike type is " + bike.getVehicleType() + " it's speed is " + bike.maxSpeed(bike.getVehicleType()));
        System.out.println(bike.getManufacturerInformation());
        System.out.println();

        Car car = new Car("BMW", "X6", "sportsCar");
        car.maxSpeed(car.getVehicleType());
        car.getManufacturerInformation();
        System.out.println("Car type is " + car.getVehicleType() + " it's speed is " + car.maxSpeed(car.getVehicleType()));
        System.out.println(car.getManufacturerInformation());
    }
}
