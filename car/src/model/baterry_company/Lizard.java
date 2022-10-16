package model.baterry_company;

import model.Battery;

public class Lizard extends Battery {
    private double priceInDolars;
    private boolean contractsWithState;

    public Lizard(String named, double price, String type, double capacity, boolean autoGenerated, double priceInDolars, boolean contractsWithState) {
        super(named, price, type, capacity, autoGenerated);
        this.priceInDolars = priceInDolars;
        this.contractsWithState = contractsWithState;
    }

    public double getPriceInDolars() {
        return priceInDolars;
    }

    public void setPriceInDolars(double priceInDolars) {
        this.priceInDolars = priceInDolars;
    }

    public boolean isContractsWithState() {
        return contractsWithState;
    }

    public void setContractsWithState(boolean contractsWithState) {
        this.contractsWithState = contractsWithState;
    }

    @Override
    public String toString() {
        return "Lizard{" +
                "priceInDolars=" + priceInDolars +
                ", contractsWithState=" + contractsWithState +
                '}';
    }
}
