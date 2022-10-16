package model;

public class Light extends Pieces {
    private ColorOfLight colorOfLight;
    private double power;

    public Light(String named, double price, ColorOfLight colorOfLight, double power) {
        super(named, price);
        this.colorOfLight = colorOfLight;
        this.power = power;
    }

    public ColorOfLight getColorOfLight() {
        return colorOfLight;
    }

    public void setColorOfLight(ColorOfLight colorOfLight) {
        this.colorOfLight = colorOfLight;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
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
        return "Light{" +
                "colorOfLight=" + colorOfLight.toString() +
                ", power=" + power +
                '}';
    }
}
