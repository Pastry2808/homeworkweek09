package inheritancepolymorphismencapsulation.polymorphism08;

public class Programmer extends Employee{

    public static void main(String[] args) {
        Programmer programmer =new Programmer();
        programmer.calculateSalary(200);
    }

    @Override
    public void calculateSalary(double salary) {
        System.out.println("Programmer pay "+salary);
    }
}
