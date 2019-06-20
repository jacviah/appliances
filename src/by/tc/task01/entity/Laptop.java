package by.tc.task01.entity;

import java.util.Objects;

public class Laptop extends Appliance{
    private double BATTERY_CAPACITY;
    private int MEMORY_ROM;
    private int SYSTEM_MEMORY;
    private double CPU;
    private int DISPLAY_INCHS;
    private String OS;

    public Laptop() {
    }

    public Laptop(double BATTERY_CAPACITY, int MEMORY_ROM, int SYSTEM_MEMORY, double CPU, int DISPLAY_INCHS, String OS) {
        this.BATTERY_CAPACITY = BATTERY_CAPACITY;
        this.MEMORY_ROM = MEMORY_ROM;
        this.SYSTEM_MEMORY = SYSTEM_MEMORY;
        this.CPU = CPU;
        this.DISPLAY_INCHS = DISPLAY_INCHS;
        this.OS = OS;
    }

    public double getBATTERY_CAPACITY() {
        return BATTERY_CAPACITY;
    }

    public void setBATTERY_CAPACITY(double BATTERY_CAPACITY) {
        this.BATTERY_CAPACITY = BATTERY_CAPACITY;
    }

    public int getMEMORY_ROM() {
        return MEMORY_ROM;
    }

    public void setMEMORY_ROM(int MEMORY_ROM) {
        this.MEMORY_ROM = MEMORY_ROM;
    }

    public int getSYSTEM_MEMORY() {
        return SYSTEM_MEMORY;
    }

    public void setSYSTEM_MEMORY(int SYSTEM_MEMORY) {
        this.SYSTEM_MEMORY = SYSTEM_MEMORY;
    }

    public double getCPU() {
        return CPU;
    }

    public void setCPU(double CPU) {
        this.CPU = CPU;
    }

    public int getDISPLAY_INCHS() {
        return DISPLAY_INCHS;
    }

    public void setDISPLAY_INCHS(int DISPLAY_INCHS) {
        this.DISPLAY_INCHS = DISPLAY_INCHS;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.BATTERY_CAPACITY, BATTERY_CAPACITY) == 0 &&
                MEMORY_ROM == laptop.MEMORY_ROM &&
                SYSTEM_MEMORY == laptop.SYSTEM_MEMORY &&
                Double.compare(laptop.CPU, CPU) == 0 &&
                DISPLAY_INCHS == laptop.DISPLAY_INCHS &&
                Objects.equals(OS, laptop.OS);
    }

    @Override
    public int hashCode() {
        return Objects.hash(BATTERY_CAPACITY, MEMORY_ROM, SYSTEM_MEMORY, CPU, DISPLAY_INCHS, OS);
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
