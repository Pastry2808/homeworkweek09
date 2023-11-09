package inheritancepolymorphismencapsulation.inheritance03;

public class SavingsAccount extends BankAccount {
    public static void main(String[] args) {
        SavingsAccount obj = new SavingsAccount();
        obj.withdraw(100);
    }

    @Override
    public void withdraw(double amount) {
        if (amount < 100) {
            System.out.println("Not Valid ");
        } else {
            System.out.println("It's Valid ");
        }

    }
}
