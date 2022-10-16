package model;

public class TypeOfFuel extends Pieces {
    private String fuel;

    public TypeOfFuel(String named, double price, String fuel) {
        super(named, price);
        this.fuel = fuel;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
}
