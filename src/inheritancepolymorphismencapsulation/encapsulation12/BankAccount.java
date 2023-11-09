package inheritancepolymorphismencapsulation.encapsulation12;
/*
Write a Java program to create a class called BankAccount with private instance
variables accountNumber and balance. Provide public getter and setter methods to
access and modify these variables.
 */
public class BankAccount {
//private instance
//variables accountNumber and balance.
    private int accountNumber;
    private  double balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
