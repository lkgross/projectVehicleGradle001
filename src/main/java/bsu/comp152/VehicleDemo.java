package bsu.comp152;

public class VehicleDemo {
    public static void main(String[] args) {

      Vehicle v1 = new Vehicle("Panasonic", "B123", 1982, 2);
        System.out.println(v1);

        Automobile car1 = new Automobile("Toyota", "Prius", 2017);

        Automobile car2 = new Automobile("Suburu", "Ascent",
                2020, 7, true);
        System.out.println(car1);
        System.out.printf("Car1 is a %s.\n", car1.getModel());

        Taxi taxi1 = new Taxi("Toyota", "Highlander", 2016, 8,
                true, "A12345");

        // First fare of the day is $23.
        taxi1.addFare(23);
        System.out.printf("Taxi 1 fareTotal is $%.2f", taxi1.getFareTotal());

      System.out.println();

      System.out.printf("There are %d seats available in the taxi.", taxi1.getNumSeats());






    }
}
