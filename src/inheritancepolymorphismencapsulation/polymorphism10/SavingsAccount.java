package inheritancepolymorphismencapsulation.polymorphism10;

public class SavingsAccount extends BankAccount{
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.withdraw(100000,"Saving");
    }

    @Override
    public void withdraw(double amount, String accountType) {
        if (amount<=2000){
            System.out.println("Withdrawal is successful");
        } else if (amount>=2000){
            System.out.println("Withdrawal unsuccessful.Enter an amount within your limit");
        }
       else if (amount <= 1000) {
            System.out.println("Fees free for " + amount);
        } else if (amount > 1000) {
            System.out.println("0.10% fees for " + amount);
        }
    }
}
