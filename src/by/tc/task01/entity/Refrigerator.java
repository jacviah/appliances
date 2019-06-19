package by.tc.task01.entity;

public class Refrigerator extends Appliance {

    private int POWER_CONSUMPTION;
    private int WEIGHT;
    private int FREEZER_CAPACITY;
    private double OVERALL_CAPACITY;
    private double HEIGHT;
    private double WIDTH;

    public Refrigerator(int POWER_CONSUMPTION, int WEIGHT, int FREEZER_CAPACITY, double OVERALL_CAPACITY, double HEIGHT, double WIDTH) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
        this.WEIGHT = WEIGHT;
        this.FREEZER_CAPACITY = FREEZER_CAPACITY;
        this.OVERALL_CAPACITY = OVERALL_CAPACITY;
        this.HEIGHT = HEIGHT;
        this.WIDTH = WIDTH;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "POWER_CONSUMPTION=" + POWER_CONSUMPTION +
                ", WEIGHT=" + WEIGHT +
                ", FREEZER_CAPACITY=" + FREEZER_CAPACITY +
                ", OVERALL_CAPACITY=" + OVERALL_CAPACITY +
                ", HEIGHT=" + HEIGHT +
                ", WIDTH=" + WIDTH +
                '}';
    }
}
