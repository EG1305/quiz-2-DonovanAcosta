public class SavingsAccount extends BankAccount {
    double interestRate;
    
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest(){
        double interestAccumulated = this.balance * interestRate;
        this. balance = this.balance + interestAccumulated;
        System.err.println("Interest Rate applied: " + interestRate +"\nBalance: " + this.balance);
    }
}
