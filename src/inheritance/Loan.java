package inheritance;

public class Loan extends Bank {
    protected double interestRate;
    protected int paymentsNumber;
    protected double loanAmount;

    public Loan(int accountNUmber, String accountName, double balance, double interestRate, int paymentsNumber, double loanAmount) {
        super(accountNUmber, accountName, balance);
        this.interestRate = interestRate;
        this.paymentsNumber = paymentsNumber;
        this.loanAmount = loanAmount;
    }

    public double monthlyPayments(){
        return loanAmount*interestRate/paymentsNumber;
    }

    public double totalPayment(){
        return loanAmount*interestRate;
    }
}
