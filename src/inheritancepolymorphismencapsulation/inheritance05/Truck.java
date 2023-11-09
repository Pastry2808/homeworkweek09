package inheritancepolymorphismencapsulation.inheritance05;

public class Truck extends Vehicle{
    public static void main(String[] args) {
        Truck t = new Truck();
        t.properties("BMW", "B101N02", 2017, "Diesel");
        t.calculatingFuelEfficiency(100, 200);
        t.distanceTraveled(100);
        t.maximumSpeed(100);
    }


}
