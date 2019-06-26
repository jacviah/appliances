package by.tc.task01.entity;

import java.util.Objects;

public class Speakers implements Appliance{

    private int powerConsumption;
    private int numberOfSpeakers;
    private int cordLengthGTH;
    private String frequencyRangeGE;

    public Speakers() {
    }

    public Speakers(int powerConsumption, int numberOfSpeakers, int cordLengthGTH, String frequencyRangeGE) {
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.cordLengthGTH = cordLengthGTH;
        this.frequencyRangeGE = frequencyRangeGE;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public int getCordLengthGTH() {
        return cordLengthGTH;
    }

    public void setCordLengthGTH(int cordLengthGTH) {
        this.cordLengthGTH = cordLengthGTH;
    }

    public String getFrequencyRangeGE() {
        return frequencyRangeGE;
    }

    public void setFrequencyRangeGE(String frequencyRangeGE) {
        this.frequencyRangeGE = frequencyRangeGE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speakers speakers = (Speakers) o;
        return powerConsumption == speakers.powerConsumption &&
                numberOfSpeakers == speakers.numberOfSpeakers &&
                cordLengthGTH == speakers.cordLengthGTH &&
                Objects.equals(frequencyRangeGE, speakers.frequencyRangeGE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, numberOfSpeakers, cordLengthGTH, frequencyRangeGE);
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", cordLengthGTH=" + cordLengthGTH +
                ", frequencyRangeGE='" + frequencyRangeGE + '\'' +
                '}';
    }
}
