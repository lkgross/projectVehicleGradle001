package bsu.comp152;

/**
 * Vehicle - A class that represents a vehicle
 * It is a superclass of all the other classes that represent vehicles,
 * such as Automobile.
 *
 * Automobile is a subclass of Vehicle.
 *
 * Subclasses of Vehicle are Automobile, Motorcycle, Truck, and their subclasses.
 *
 * We speak of an "is-a relationship": A Motorcycle is-a Vehicle, etc.
 *
 * We also say Vehicle is a base or parent class of the Automobile class.
 *
 * Automobile is a derived or child class of Vehicle.
 *
 * Fields and methods that all vehicles have in common are defined here in Vehicle.
 * The fields and methods are inherited by the subclasses of this class.
 *
 * Starter code from Computer Science 111, Boston University
 * Modified by Laura K. Gross, COMP 152, Bridgewater State University
 */
public class Vehicle {
    private String make;
    private String model;
    private int year;
    private int mileage;
    private String plateNumber;
    private int numWheels;

    public void setMileage(int newMileage) {
        if (newMileage < mileage){
            throw new IllegalArgumentException();
        }
        mileage = newMileage;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

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

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public int getNumWheels() {
        return numWheels;
    }

    /**
     * A method that creates a string that can be used when printing
     * Vehicles
     *
     * This method overrides the toString method inherited from
     * the Object class.
     * @return
     */
    @Override
    public String toString() {
        return make + " " + model;
    }
}
