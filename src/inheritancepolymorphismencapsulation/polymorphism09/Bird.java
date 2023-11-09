package inheritancepolymorphismencapsulation.polymorphism09;

public class Bird extends Animal{
    public static void main(String[] args) {
        Bird b = new Bird();
        b.move();
        b.makeSound();
    }

    @Override
    public void move() {
        System.out.println("Bird can fly ");
    }

    @Override
    public void makeSound() {

        System.out.println("Bird sound is che che.....");

    }
}
