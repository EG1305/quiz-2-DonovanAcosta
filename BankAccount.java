public class BankAccount {
    String accountNumber ;
    double balance = 0;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }    

    public void deposit(double amount) {
        this.balance = this.balance + amount;
        System.err.println("Amount deposited: " + amount + "\nBalance: " + this.balance);
    }

    public void withdraw(double amount){
        this.balance = this.balance - amount;
        System.err.println("Amount withdrawn: " + amount + "\nBalance: " + this.balance);
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    
}
