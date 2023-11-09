package inheritancepolymorphismencapsulation.polymorphism06;

public class Bird extends Animal {

    public static void main(String[] args) {
        Bird b = new Bird();
        b.Sound();
    }

    @Override
    public void Sound() {
        System.out.println("Bird sound like Koooo...!!");
    }
}
