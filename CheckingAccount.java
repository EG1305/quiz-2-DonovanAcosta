public class CheckingAccount extends BankAccount {
    double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void overrideWidthdraw(double amount){
        if(amount > (this.balance + overdraftLimit)){
            System.err.println("Can not withdraw amount. Try again");
        }
        else{
            withdraw(amount);
        }
    }
}
