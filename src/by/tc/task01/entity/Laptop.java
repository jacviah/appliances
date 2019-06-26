package by.tc.task01.entity;

import java.util.Objects;

public class Laptop implements Appliance{
    private double batteryCapacity;
    private int memoryRom;
    private int systemMemory;
    private double cpu;
    private int displayInchs;
    private String OS;

    public Laptop() {
    }

    public Laptop(double batteryCapacity, int memoryRom, int systemMemory, double cpu, int displayInchs, String OS) {
        this.batteryCapacity = batteryCapacity;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInchs = displayInchs;
        this.OS = OS;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public int getDisplayInchs() {
        return displayInchs;
    }

    public void setDisplayInchs(int displayInchs) {
        this.displayInchs = displayInchs;
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
        return Double.compare(laptop.batteryCapacity, batteryCapacity) == 0 &&
                memoryRom == laptop.memoryRom &&
                systemMemory == laptop.systemMemory &&
                Double.compare(laptop.cpu, cpu) == 0 &&
                displayInchs == laptop.displayInchs &&
                Objects.equals(OS, laptop.OS);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, memoryRom, systemMemory, cpu, displayInchs, OS);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity=" + batteryCapacity +
                ", memoryRom=" + memoryRom +
                ", systemMemory=" + systemMemory +
                ", cpu=" + cpu +
                ", displayInchs=" + displayInchs +
                ", OS='" + OS + '\'' +
                '}';
    }
}
