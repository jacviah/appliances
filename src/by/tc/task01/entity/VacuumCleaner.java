package by.tc.task01.entity;

import java.util.Objects;

public class VacuumCleaner extends Appliance{

    private int POWER_CONSUMPTION;
    private int MOTOR_SPEED_REGULATION;
    private int CLEANING_WIDTH;
    private String FILTER_TYPE;
    private String BAG_TYPE;
    private String WAND_TYPE;

    public VacuumCleaner() {
    }

    public VacuumCleaner(int POWER_CONSUMPTION, int MOTOR_SPEED_REGULATION, int CLEANING_WIDTH, String FILTER_TYPE, String BAG_TYPE, String WAND_TYPE) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
        this.MOTOR_SPEED_REGULATION = MOTOR_SPEED_REGULATION;
        this.CLEANING_WIDTH = CLEANING_WIDTH;
        this.FILTER_TYPE = FILTER_TYPE;
        this.BAG_TYPE = BAG_TYPE;
        this.WAND_TYPE = WAND_TYPE;
    }

    public int getPOWER_CONSUMPTION() {
        return POWER_CONSUMPTION;
    }

    public void setPOWER_CONSUMPTION(int POWER_CONSUMPTION) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
    }

    public int getMOTOR_SPEED_REGULATION() {
        return MOTOR_SPEED_REGULATION;
    }

    public void setMOTOR_SPEED_REGULATION(int MOTOR_SPEED_REGULATION) {
        this.MOTOR_SPEED_REGULATION = MOTOR_SPEED_REGULATION;
    }

    public int getCLEANING_WIDTH() {
        return CLEANING_WIDTH;
    }

    public void setCLEANING_WIDTH(int CLEANING_WIDTH) {
        this.CLEANING_WIDTH = CLEANING_WIDTH;
    }

    public String getFILTER_TYPE() {
        return FILTER_TYPE;
    }

    public void setFILTER_TYPE(String FILTER_TYPE) {
        this.FILTER_TYPE = FILTER_TYPE;
    }

    public String getBAG_TYPE() {
        return BAG_TYPE;
    }

    public void setBAG_TYPE(String BAG_TYPE) {
        this.BAG_TYPE = BAG_TYPE;
    }

    public String getWAND_TYPE() {
        return WAND_TYPE;
    }

    public void setWAND_TYPE(String WAND_TYPE) {
        this.WAND_TYPE = WAND_TYPE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return POWER_CONSUMPTION == that.POWER_CONSUMPTION &&
                MOTOR_SPEED_REGULATION == that.MOTOR_SPEED_REGULATION &&
                CLEANING_WIDTH == that.CLEANING_WIDTH &&
                Objects.equals(FILTER_TYPE, that.FILTER_TYPE) &&
                Objects.equals(BAG_TYPE, that.BAG_TYPE) &&
                Objects.equals(WAND_TYPE, that.WAND_TYPE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(POWER_CONSUMPTION, MOTOR_SPEED_REGULATION, CLEANING_WIDTH, FILTER_TYPE, BAG_TYPE, WAND_TYPE);
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "POWER_CONSUMPTION=" + POWER_CONSUMPTION +
                ", MOTOR_SPEED_REGULATION=" + MOTOR_SPEED_REGULATION +
                ", CLEANING_WIDTH=" + CLEANING_WIDTH +
                ", FILTER_TYPE='" + FILTER_TYPE + '\'' +
                ", BAG_TYPE='" + BAG_TYPE + '\'' +
                ", WAND_TYPE='" + WAND_TYPE + '\'' +
                '}';
    }
}
