package by.tc.task01.entity;

public class VacuumCleaner extends Appliance{

    private int POWER_CONSUMPTION;
    private int MOTOR_SPEED_REGULATION;
    private int CLEANING_WIDTH;
    private String FILTER_TYPE;
    private String BAG_TYPE;
    private String WAND_TYPE;

    public VacuumCleaner(int POWER_CONSUMPTION, int MOTOR_SPEED_REGULATION, int CLEANING_WIDTH, String FILTER_TYPE, String BAG_TYPE, String WAND_TYPE) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
        this.MOTOR_SPEED_REGULATION = MOTOR_SPEED_REGULATION;
        this.CLEANING_WIDTH = CLEANING_WIDTH;
        this.FILTER_TYPE = FILTER_TYPE;
        this.BAG_TYPE = BAG_TYPE;
        this.WAND_TYPE = WAND_TYPE;
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
