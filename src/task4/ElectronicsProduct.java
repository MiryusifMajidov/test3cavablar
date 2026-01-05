package task4;

public class ElectronicsProduct {
    int productId;
    String name;
    double price;

    public  ElectronicsProduct(int productId, String name, double price)
    {
        this.name = name;
        this.productId = productId;
        this.price = price;
    }

    public double discount(double discount){
        return price-price*discount/100;
    }

}
