package inheritancepolymorphismencapsulation.encapsulation12;

public class BankAccountChild extends BankAccount{
    public static void main(String[] args) {
        BankAccountChild bankAccountChild = new BankAccountChild();
        bankAccountChild.setAccountNumber(232310);
        bankAccountChild.setBalance(50000);

        System.out.println("Bank Account Number is:- "+bankAccountChild.getAccountNumber());
        System.out.println("Account Balance is:- "+bankAccountChild.getBalance());

    }
}
