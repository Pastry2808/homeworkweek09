package inheritancepolymorphismencapsulation.polymorphism06;

public class Cat extends Animal {

    public static void main(String[] args) {
       Cat c = new Cat();
       c.Sound();
    }

    @Override
    public void Sound() {
        System.out.println("Cat sound like Meowww......");
    }
}
