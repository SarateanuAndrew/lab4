package model;

public class TypeOfCar extends Pieces {
    private String type;

    public TypeOfCar(String named, double price, String type) {
        super(named, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
