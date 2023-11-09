package inheritancepolymorphismencapsulation.inheritance05;

public class Motorcycle extends Vehicle {

    public static void main(String[] args) {
        Motorcycle m = new Motorcycle();
        m.properties("BMW", "B101N02", 2017, "Diesel");
        m.calculatingFuelEfficiency(100, 200);
        m.distanceTraveled(100);
        m.maximumSpeed(100);
    }

}

