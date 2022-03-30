package bsu.comp152;

/**
 * Automobile - A class that represents an automobile
 *
 * It is a subclass of Vehicle, so it inherits the fields and
 * methods of Vehicle.
 *
 * It also extends the capabilities of the Vehicle class with
 * more specialized functionality.
 *
 * Note the required syntax "extends Vehicle".
 *
 * Starter code from Computer Science 111, Boston University
 * Modified by Laura K. Gross, COMP 152, Bridgewater State University
 */
public class Automobile extends Vehicle {

    private int numSeats;
    private boolean isSUV;

    /**
     * A constructor with five parameters
     *
     * @param make
     * @param model
     * @param year
     * @param numSeats
     * @param isSUV
     *
     * To initialize inherited fields, the constructor must
     * call a constructor from the superclass.
     *
     * It calls the constructor from the superclass using the keyword super,
     * followed by appropriate parameters for the superclass constructor.
     *
     * Make the call as the very first line of the Automobile constructor
     * (as when one constructor calls another with the reference variable this
     * from within the same class).
     *
     * If we omit the call to super, then the compiler tries to inssert a
     * default call to the superclass constructor with no parameters.
     * If there isn't such a constructor, we get a compile-time error.
     */
    public Automobile(String make, String model, int year,
                      int numSeats, boolean isSUV){
        super(make, model, year, 4);
        this.numSeats = numSeats;
        this.isSUV = isSUV;
    }

    public Automobile(String make, String model, int year){
        super(make, model, year, 4);
        numSeats = 5;
        isSUV = false;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public boolean isSUV() {
        return isSUV;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "numSeats=" + numSeats +
                ", isSUV=" + isSUV +
                '}';
    }
}
