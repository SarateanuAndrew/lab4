package model;

public class Motor extends Pieces {
    private TypeOfMotor motorType;
    private double capacity;

    public Motor(String named, double price, TypeOfMotor motorType, double capacity) {
        super(named, price);
        this.motorType = motorType;
        this.capacity = capacity;
    }

    public TypeOfMotor getMotorType() {
        return motorType;
    }

    public void setMotorType(TypeOfMotor motorType) {
        this.motorType = motorType;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
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

    @Override
    public String toString() {
        return "Motor{" +
                "motorType=" + motorType +
                ", capacity=" + capacity +
                '}';
    }
}
