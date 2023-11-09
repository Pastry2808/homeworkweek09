package inheritancepolymorphismencapsulation.encapsulation14;

public class CarChild extends Car{
    public static void main(String[] args) {
        CarChild carChild = new CarChild();
        carChild.setCompany_name("Maruti");
        carChild.setModel_name("AltoK10");
        carChild.setYear(2017);

        System.out.println("Car Company Name is :- "+carChild.getCompany_name());
        System.out.println("Car Model Name is :- "+carChild.getModel_name());
        System.out.println("Car Year is :- "+carChild.getYear());
        System.out.println("Car Mileage is :- "+carChild.getMileage());
    }
}
