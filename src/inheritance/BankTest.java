package inheritance;

public class BankTest {
    public static void main(String[] args) {
        Bank myBank = new Bank(123,"savings", 500);
        System.out.println(myBank.toString());
        myBank.drawMoney(50);
        myBank.addMoney(200);
        myBank.setAccountName("checking");
        System.out.println(myBank.toString());
        myBank.setAccountName("savings");
        System.out.println(myBank.toString());
        System.out.println("----------------------");

        Loan loan =new Loan(123,"savings", 200, 1,4,20);
        System.out.println(loan.toString());
        System.out.println(loan.monthlyPayments());
        System.out.println(loan.totalPayment());
        System.out.println("----------------------");

        CarLoan myCar = new CarLoan(123,"savings", 6000,1.5,5,3000,1.2,798);
        System.out.println(myCar.monthlyPayments());
        System.out.println(myCar.totalPayment());
    }
}
