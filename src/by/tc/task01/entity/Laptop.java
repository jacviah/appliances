package by.tc.task01.entity;

public class Laptop extends Appliance{
    private double BATTERY_CAPACITY;
    private int MEMORY_ROM;
    private int SYSTEM_MEMORY;
    private double CPU;
    private int DISPLAY_INCHS;
    private String OS;

    public Laptop(double BATTERY_CAPACITY, int MEMORY_ROM, int SYSTEM_MEMORY, double CPU, int DISPLAY_INCHS, String OS) {
        this.BATTERY_CAPACITY = BATTERY_CAPACITY;
        this.MEMORY_ROM = MEMORY_ROM;
        this.SYSTEM_MEMORY = SYSTEM_MEMORY;
        this.CPU = CPU;
        this.DISPLAY_INCHS = DISPLAY_INCHS;
        this.OS = OS;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "BATTERY_CAPACITY=" + BATTERY_CAPACITY +
                ", MEMORY_ROM=" + MEMORY_ROM +
                ", SYSTEM_MEMORY=" + SYSTEM_MEMORY +
                ", CPU=" + CPU +
                ", DISPLAY_INCHS=" + DISPLAY_INCHS +
                ", OS='" + OS + '\'' +
                '}';
    }
}
