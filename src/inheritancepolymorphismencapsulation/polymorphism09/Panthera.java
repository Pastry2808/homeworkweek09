package inheritancepolymorphismencapsulation.polymorphism09;

public class Panthera extends Animal {

    public static void main(String[] args) {
        Panthera p = new Panthera();
        p.makeSound();
        p.move();
    }

    @Override
    public void move() {
        System.out.println("Panthera move on land ");

    }

    @Override
    public void makeSound() {
        System.out.println("Panthera sound Awww Awww...");

    }
}
