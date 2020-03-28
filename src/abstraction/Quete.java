package abstraction;

abstract class Quete {
    protected String customerName;
    protected double squareFeet;
    protected double price;

    public Quete(String customerName, double squareFeet, double price) {
        this.customerName = customerName;
        this.squareFeet = squareFeet;
        this.price = price;
    }

    abstract double calculateTotalPrice();

    abstract void printQuete();
}
