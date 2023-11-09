package inheritancepolymorphismencapsulation.encapsulation13;

public class EmployeeChild extends Employee{
    public static void main(String[] args) {
        EmployeeChild employee= new EmployeeChild();
        employee.setEmployee_id(100);
        employee.setEmployee_name("Nayan Patel");
        System.out.println("Employee ID :- "+employee.getEmployee_id());
        System.out.println("Employee Name :- "+employee.getEmployee_name());
        System.out.println(employee.getEmployee_salary(2000));

        employee.setEmployee_name("Khushbu Patel");
        employee.setEmployee_id(101);
        System.out.println("Employee ID :- "+employee.getEmployee_id());
        System.out.println("Employee Name :- "+employee.getEmployee_name());
        System.out.println("Employee salary :- "+employee.getEmployee_salary(30000)+"£");

        employee.setEmployee_name("Khushboo Patel");
        employee.setEmployee_id(101);
        System.out.println("Employee ID :- "+employee.getEmployee_id());
        System.out.println("Employee Name :- "+employee.getEmployee_name());
        System.out.println("Employee salary :- "+employee.getEmployee_salary(20000)+"£");

        employee.setEmployee_name("Avani Patel");
        employee.setEmployee_id(102);
        System.out.println("Employee ID :- "+employee.getEmployee_id());
        System.out.println("Employee Name :- "+employee.getEmployee_name());
        System.out.println("Employee salary :- "+employee.getEmployee_salary(10000)+"£");

        employee.setEmployee_name(" Ripti Patel");
        employee.setEmployee_id(103);
        System.out.println("Employee ID :- "+employee.getEmployee_id());
        System.out.println("Employee Name :- "+employee.getEmployee_name());
        System.out.println("Employee salary :- "+employee.getEmployee_salary(30000)+"£");

        employee.setEmployee_name("Kinjal Shah");
        employee.setEmployee_id(104);
        System.out.println("Employee ID :- "+employee.getEmployee_id());
        System.out.println("Employee Name :- "+employee.getEmployee_name());
        System.out.println("Employee salary :- "+employee.getEmployee_salary(15000)+"£");



    }

}
