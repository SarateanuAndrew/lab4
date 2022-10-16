package model;

public class TypeOfGearBox extends Pieces {
    private boolean mechanic;

    public TypeOfGearBox(String named, double price, boolean mechanic) {
        super(named, price);
        this.mechanic = mechanic;
    }

    public void show(){
        if (mechanic){
            System.out.println("Car has a mechanic gearbox");
            return;
        }
        System.out.println("Car has an automatic gearbox");
    }

}
