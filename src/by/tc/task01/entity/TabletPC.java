package by.tc.task01.entity;

import java.util.Objects;

public class TabletPC implements Appliance{

    private int batteryCapacity;
    private int displayInches;
    private int memoryRom;
    private int flashMemoryCapacity;
    private String COLOR;

    public TabletPC() {
    }

    public TabletPC(int batteryCapacity, int displayInches, int memoryRom, int flashMemoryCapacity, String COLOR) {
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.COLOR = COLOR;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getCOLOR() {
        return COLOR;
    }

    public void setCOLOR(String COLOR) {
        this.COLOR = COLOR;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabletPC tabletPC = (TabletPC) o;
        return batteryCapacity == tabletPC.batteryCapacity &&
                displayInches == tabletPC.displayInches &&
                memoryRom == tabletPC.memoryRom &&
                flashMemoryCapacity == tabletPC.flashMemoryCapacity &&
                Objects.equals(COLOR, tabletPC.COLOR);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, COLOR);
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "batteryCapacity=" + batteryCapacity +
                ", displayInches=" + displayInches +
                ", memoryRom=" + memoryRom +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                ", COLOR='" + COLOR + '\'' +
                '}';
    }
}
