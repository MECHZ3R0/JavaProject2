package inheritance;

public class Bank {
    protected int accountNUmber;
    protected String accountName;
    protected double balance;

    public Bank(int accountNUmber, String accountName, double balance) {
        this.accountNUmber = accountNUmber;
        this.accountName = accountName;
        this.balance = balance;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void addMoney(double money) {
        this.balance += money;
    }

    public void drawMoney(double money) {
        if(money<this.balance) {
            this.balance -= money;
        }
        else{
            System.out.println("Amount of the money exceeds current balance!");
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accountNUmber=" + accountNUmber +
                ", accountName='" + accountName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
