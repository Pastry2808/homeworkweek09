package inheritancepolymorphismencapsulation.polymorphism07;

public class Bicycle extends Vehicle{

    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        b.speedUp();
    }
    @Override
    public void speedUp() {
        System.out.println("New Bicycle speed is 60mh");
    }
}
