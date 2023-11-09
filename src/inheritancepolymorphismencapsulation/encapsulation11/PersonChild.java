package inheritancepolymorphismencapsulation.encapsulation11;

public class PersonChild extends Person{
    public static void main(String[] args) {
        PersonChild personChild = new PersonChild();
        personChild.setName("Nayan Patel");
        personChild.setAge(35);
        personChild.setCountry("UK");

        System.out.println("Person Name is :- "+personChild.getName());
        System.out.println("Person Age is :- "+personChild.getAge());
        System.out.println("Person Country is :- "+personChild.getCountry());
    }
}
