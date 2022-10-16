package model;

public class TypeOfMotor extends Pieces {
    private String mark;
    private int numberOfPistons;

    public TypeOfMotor(String named, double price, String mark, int numberOfPistons) {
        super(named, price);
        this.mark = mark;
        this.numberOfPistons = numberOfPistons;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getNumberOfPistons() {
        return numberOfPistons;
    }

    public void setNumberOfPistons(int numberOfPistons) {
        this.numberOfPistons = numberOfPistons;
    }

    @Override
    public String toString() {
        return "TypeOfMotor{" +
                "mark='" + mark + '\'' +
                ", numberOfPistons=" + numberOfPistons +
                '}';
    }
}
