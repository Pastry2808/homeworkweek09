package inheritancepolymorphismencapsulation.inheritance02;
/*
2. Write a Java program to create a class called Vehicle with a method called drive().
Create a subclass called Car that overrides the drive() method to print "Repairing a
car".
 */
public class Car extends Vehicle{
    public static void main(String[] args) {
        Car obj1 = new Car();
        obj1.drive();
    }
}
