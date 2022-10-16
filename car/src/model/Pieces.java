package model;

public class Pieces {
    private String named;
    private double price;
    public double priceWithProcents(){
        return 0;
    }

    public Pieces(String named, double price) {
        this.named = named;
        this.price = price;
    }

    public String getNamed() {
        return named;
    }

    public void setNamed(String named) {
        this.named = named;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
