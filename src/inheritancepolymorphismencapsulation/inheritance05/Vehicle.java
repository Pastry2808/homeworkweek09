package inheritancepolymorphismencapsulation.inheritance05;
/*
5. Write a Java program to create a vehicle class hierarchy. The base class should be
Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have
properties such as make, model, year, and fuel type. Implement methods for
calculating fuel efficiency, distance traveled, and maximum speed.
 */

public class Vehicle {

    public void properties(String make, String model, int year, String fuelType) {
        System.out.println("Making of "+make);
        System.out.println("Vehicle Model is :- "+model);
        System.out.println("Vehicle Year :- "+year);
        System.out.println("Type of Fuel :- "+fuelType);
    }
    public void calculatingFuelEfficiency(double distance, double fuelUsed) {
        double fuelEfficiency = distance / fuelUsed;
        System.out.println("calculatingFuelEfficiency :- " + fuelEfficiency);
    }

    public void distanceTraveled(double dist) {
        System.out.println("distanceTraveled :-" + dist);
    }

    public void maximumSpeed(double maxSpeed) {
        System.out.println("maximumSpeed" + maxSpeed);

    }

}
