package inheritancepolymorphismencapsulation.polymorphism10;

public class CheckingAccount extends BankAccount {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.withdraw(1000000, "Savings");
    }

    @Override
    public void withdraw(double amount, String accountType) {

        if (accountType == "Checking") {
            System.out.println("Account Type:- " + accountType);
        } else if (accountType != "Checking") {
            System.out.println("Enter valid Account type");

        }
//        if (amount<=2000){
//            System.out.println("Withdrawal is successful");
//        } else if (amount>=2000){
//            System.out.println("Withdrawal unsuccessful.Enter an amount within your limit");
//        }
//        else if (amount <= 1000) {
//            System.out.println("Fees free for " + amount);
//        } else if (amount > 1000) {
//            System.out.println("0.10% fees for " + amount);
//        }

    }

}

