package bsu.comp152;

public class Vehicle {
    private String make;
    private String model;
    private int year;
    private int mileage;
    private String plateNumber;
    private int numWheels;

    public Vehicle(String make, String model, int year, int numWheels){
        this.make = make;
        this.model = model;
        if (year < 1900){
            throw new IllegalArgumentException();
        }
        this.year = year;
        this.numWheels = numWheels;
        mileage = 0;
        plateNumber = "unknown";
    }
}
