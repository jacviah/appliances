package by.tc.task01.entity;

public class Oven extends Appliance{

    private int POWER_CONSUMPTION;
    private int WEIGHT;
    private int CAPACITY;
    private int DEPTH;
    private double HEIGHT;
    private double WIDTH;

    public Oven(int POWER_CONSUMPTION, int WEIGHT, int CAPACITY, int DEPTH, double HEIGHT, double WIDTH) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
        this.WEIGHT = WEIGHT;
        this.CAPACITY = CAPACITY;
        this.DEPTH = DEPTH;
        this.HEIGHT = HEIGHT;
        this.WIDTH = WIDTH;
    }

    @Override
    public String toString() {
        return "Oven{" +
                "POWER_CONSUMPTION=" + POWER_CONSUMPTION +
                ", WEIGHT=" + WEIGHT +
                ", CAPACITY=" + CAPACITY +
                ", DEPTH=" + DEPTH +
                ", HEIGHT=" + HEIGHT +
                ", WIDTH=" + WIDTH +
                '}';
    }

// you may add your own code here
}
