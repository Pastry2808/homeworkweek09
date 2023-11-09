package inheritancepolymorphismencapsulation.polymorphism08;
/*
8. Write a Java program to create a class Employee with a method called
calculateSalary(). Create two subclasses Manager and Programmer. In each subclass,
override the calculateSalary() method to calculate and return the salary based on their
specific roles.
 */
public class Employee {

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.calculateSalary(2000);
    }

    public void calculateSalary(double salary){

        if (salary<=40000){
            System.out.println("Programer  salary"+salary);

        }else if (salary>40000 && salary <=65000){
            System.out.println("Manager  salary "+salary);
        }
    }



}
