package inheritancepolymorphismencapsulation.inheritance04;

public class Cheetah extends Animal{
    public static void main(String[] args) {
        Cheetah objc = new Cheetah();
        objc.move();


    }

    @Override
    public void move() {
        System.out.println("Run");
    }
}
