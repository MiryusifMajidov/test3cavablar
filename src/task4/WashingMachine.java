package task4;

public class WashingMachine extends ElectronicsProduct{
    public int warrantyYears;
    public WashingMachine(int productId, String name, double price, int warrantyYears){
        super(productId, name, price);
        this.warrantyYears = warrantyYears;

    }
    public void extendWarranty(int year)
    {
        warrantyYears+= year;
    }

    public void display() {
        System.out.println("Product: " + name);
        System.out.println("Final Price: " + discount(10));
        System.out.println("Warranty: " + warrantyYears + " years");
    }

}
