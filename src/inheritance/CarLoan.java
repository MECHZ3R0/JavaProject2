package inheritance;

public class CarLoan extends Loan {
    private double apr;
    private int creditScore;

    public CarLoan(int accountNUmber, String accountName, double balance, double interestRate, int paymentsNumber, double loanAmount, double apr, int creditScore) {
        super(accountNUmber, accountName, balance, interestRate, paymentsNumber, loanAmount);
        this.apr = apr;
        this.creditScore = creditScore;
    }

    public double monthlyPayments(){
        return super.loanAmount*this.apr/super.paymentsNumber-(this.creditScore/10);
    }
}
