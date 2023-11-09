package inheritancepolymorphismencapsulation.polymorphism08;

public class Manager extends Employee {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.calculateSalary(50000);
    }

    @Override
    public void calculateSalary(double salary) {
        System.out.println("Manager Pay "+salary);
    }
}
