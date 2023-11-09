package inheritancepolymorphismencapsulation.polymorphism07;

public class Car extends Vehicle{
    public static void main(String[] args) {

        Car c = new Car();
        c.speedUp();
    }

    @Override
    public void speedUp() {
        System.out.println("New speed of car is 120mh");
    }
}
