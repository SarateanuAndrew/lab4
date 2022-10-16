package model;

public class Wheels extends Pieces {
    private String mark;
    private int numberOfWheels;
    private int width;

    public Wheels(String named, double price, String mark, int numberOfWheels, int width) {
        super(named, price);
        this.mark = mark;
        this.numberOfWheels = numberOfWheels;
        this.width = width;
    }

    @Override
    public double priceWithProcents() {
        return super.priceWithProcents();
    }

    public double priceWithProcents(double lowerPrice) {
        return getPrice()-lowerPrice;
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "mark='" + mark + '\'' +
                ", numberOfWheels=" + numberOfWheels +
                ", width=" + width +
                '}';
    }
}
