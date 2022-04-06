package bsu.comp152;

public class FleetDemo {

    public static void main(String[] args) {
        TractorTrailer tt1 = new TractorTrailer("Mack", "Pinnacle DayCab",
                2018, 10);

        /* Polymorphism means "many forms".
         * An object that can pass more than one is-a test can be considered polymorphic.
         * Example: A TractorTrailer object is-a Truck; A TractorTrailer is-a Vehicle.
         * And, of course, a TractorTrailer is-a TractorTrailer.
         * That is, a child class object can take any form of a class in its
         * parent hierarchy and of course itself as well [medium.com].
         */

        /* Polymorphism is useful when we have a collection of objects of
         * different but related types.
         */

        // Consider an array of objects of different but related types.
        Vehicle[] fleet = new Vehicle[4];
        /* Remember all elements in an array in Java must have the same declared type.
         * Here all elements of the array are of declared type Vehicle.
         * Each element has a different "declared type" vs. "actual type."
         * Declared type is specified when declaring a variable.
         * Actual type is specified when creating an object.
         */
        fleet[0] = new Automobile("Honda", "Civic", 2016);
        fleet[1] = new Motorcycle("Harley", "Roadster", 2017);
        fleet[2] = new TractorTrailer("Mack", "Pinnacle DayCab", 2018, 10);
        fleet[3] = new Taxi("Toyota", "Highlander Hybrid", 2016,
                8, true, "A12345");

        /*
         * When we call a method on an object,
         * - the COMPILER will check whether the class for the DECLARED type of the object
         *   defines the method
         * - if the class for the DECLARED type of the object DOES define the method,
         *   the JVM will call the method as is most appropriate for the ACTUAL type
         *   of the object.
         */
    }
}
