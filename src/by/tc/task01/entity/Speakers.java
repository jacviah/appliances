package by.tc.task01.entity;

public class Speakers extends Appliance{

    private int POWER_CONSUMPTION;
    private int NUMBER_OF_SPEAKERS;
    private int CORD_LENGTH;
    private String FREQUENCY_RANGE;

    public Speakers(int POWER_CONSUMPTION, int NUMBER_OF_SPEAKERS, int CORD_LENGTH, String FREQUENCY_RANGE) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
        this.NUMBER_OF_SPEAKERS = NUMBER_OF_SPEAKERS;
        this.CORD_LENGTH = CORD_LENGTH;
        this.FREQUENCY_RANGE = FREQUENCY_RANGE;
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "POWER_CONSUMPTION=" + POWER_CONSUMPTION +
                ", NUMBER_OF_SPEAKERS=" + NUMBER_OF_SPEAKERS +
                ", CORD_LENGTH=" + CORD_LENGTH +
                ", FREQUENCY_RANGE='" + FREQUENCY_RANGE + '\'' +
                '}';
    }
}
