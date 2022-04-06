package bsu.comp152;
/**
 * Taxi.java
 *
 * A class that represents a taxi---a subclass of Automobile
 *
 * It inherits fields and methods from Automobile:
 * We don't redefine the fields and methods from Automobile in the Taxi class.
 *
 * Starter code from Computer Science 111, Boston University
 *
 * Modified by Laura K. Gross, COMP 152, Bridgewater State University
 *
 * Completed by: [student name], [student email]
 * date: [date of completion]
 */
public class Taxi extends Automobile {

    private String taxiID; // the ID number for the Taxi
    private double fareTotal; // the amount of money the driver has collected in fares.
    private int numFares; // the number of rides the driver has provided

    public Taxi(String make, String model, int year,
                int numSeats, boolean isSUV, String id) {
        super(make, model, year, numSeats, isSUV);
        taxiID = id;
        fareTotal = 0.0;
        numFares = 0;
    }

    public void setTaxiID(String taxiID) {
        this.taxiID = taxiID;
    }

    public void addFare(double fare) {
        if (fare <= 0){
            throw new IllegalArgumentException("Argument to addFare must be postive.");
        }
        fareTotal += fare;
        numFares += 1;
    }

    public void resetFareInfo() {
        numFares = 0;
        fareTotal = 0;
    }

    public String getTaxiID() {
        return taxiID;
    }

    public double getFareTotal() {
        return fareTotal;
    }

    public int getNumFares() {
        return numFares;
    }

    @Override
    public String toString() {
        return "Taxi (id = " + taxiID + ")";
    }

    @Override
    public int getNumSeats(){
        return super.getNumSeats() - 1;
    }


}

