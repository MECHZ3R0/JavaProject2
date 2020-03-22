package inheritance;

public class HomeLoan extends Loan{
    private double pmi;

    public HomeLoan(int accountNUmber, String accountName, double balance, double interestRate, int paymentsNumber, double loanAmount, double pmi) {
        super(accountNUmber, accountName, balance, interestRate, paymentsNumber, loanAmount);
        this.pmi = pmi;
    }

    public double monthlyPayments(){
        return loanAmount*interestRate/paymentsNumber+pmi;
    }

    public double totalPayment(){
        return loanAmount*interestRate+pmi*paymentsNumber;
    }
}
