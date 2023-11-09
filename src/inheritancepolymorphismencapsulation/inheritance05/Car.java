package inheritancepolymorphismencapsulation.inheritance05;

public class Car extends Vehicle {
    public static void main(String[] args) {

        Car c = new Car();
        c.properties("Maruti", "Alto-k10", 2017, "Petrol");
        c.calculatingFuelEfficiency(100, 200);
        c.distanceTraveled(100);
        c.maximumSpeed(100);

    }
}
