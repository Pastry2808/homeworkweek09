package inheritancepolymorphismencapsulation.polymorphism07;
/*
7. Write a Java program to create a class Vehicle with a method called speedUp(). Create
two subclasses Car and Bicycle. Override the speedUp() method in each subclass to
increase the vehicle's speed differently.
 */
public class Vehicle {

    public void speedUp(){

        System.out.println("Car speed is 100mh");
        System.out.println("Bicycle  speed is 20mh");

    }
}
