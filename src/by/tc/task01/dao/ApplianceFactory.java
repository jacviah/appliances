package by.tc.task01.dao;

import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.SearchCriteria;

public class ApplianceFactory {

    public static final String paramsDelims = ", ";

    public static Appliance create(String type, String line) {

        String[] params = line.split(paramsDelims);

        if (type.equalsIgnoreCase(SearchCriteria.Laptop.class.getSimpleName())) {
            return new Laptop(Double.valueOf(params[0].split("=")[1]), //BATTERY_CAPACITY
                    Integer.valueOf(params[1].split("=")[1]), //MEMORY_ROM
                    Integer.valueOf(params[2].split("=")[1]), //SYSTEM_MEMORY
                    Double.valueOf(params[3].split("=")[1]), //CPU
                    Integer.valueOf(params[4].split("=")[1]),  //DISPLAY_INCHS
                    (params[5].split("=")[1])); //WIDTH
        }
        if (type.equalsIgnoreCase(SearchCriteria.Oven.class.getSimpleName())) {

            return new Oven(Integer.valueOf(params[0].split("=")[1]), //POWER_CONSUMPTION
                    Integer.valueOf(params[1].split("=")[1]), //WEIGHT
                    Integer.valueOf(params[2].split("=")[1]), //CAPACITY
                    Integer.valueOf(params[3].split("=")[1]), //DEPTH
                    Double.valueOf(params[4].split("=")[1]),  //HEIGHT
                    Double.valueOf(params[5].split("=")[1])); //WIDTH
        }
        if (type.equalsIgnoreCase(SearchCriteria.Refrigerator.class.getSimpleName())) {
            return new Refrigerator(Integer.valueOf(params[0].split("=")[1]), //POWER_CONSUMPTION
                    Integer.valueOf(params[1].split("=")[1]), //WEIGHT
                    Integer.valueOf(params[2].split("=")[1]), //FREEZER_CAPACITY
                    Double.valueOf(params[3].split("=")[1]), //OVERALL_CAPACITY
                    Double.valueOf(params[4].split("=")[1]),  //HEIGHT
                    Double.valueOf(params[5].split("=")[1])); //WIDTH
        }
        if (type.equalsIgnoreCase(SearchCriteria.Speakers.class.getSimpleName())) {
            return new Speakers(Integer.valueOf(params[0].split("=")[1]), //POWER_CONSUMPTION
                    Integer.valueOf(params[1].split("=")[1]), //NUMBER_OF_SPEAKERS
                    Integer.valueOf(params[2].split("=")[1]), //CORD_LENGTH
                    params[3].split("=")[1]); //FREQUENCY_RANGE

        }
        if (type.equalsIgnoreCase(SearchCriteria.TabletPC.class.getSimpleName())) {
            return new TabletPC(Integer.valueOf(params[0].split("=")[1]), //BATTERY_CAPACITY
                    Integer.valueOf(params[1].split("=")[1]), //DISPLAY_INCHES
                    Integer.valueOf(params[2].split("=")[1]), //MEMORY_ROM
                    Integer.valueOf(params[3].split("=")[1]), //FLASH_MEMORY_CAPACITY
                    params[4].split("=")[1]); //COLOR
        }
        if (type.equalsIgnoreCase(SearchCriteria.VacuumCleaner.class.getSimpleName())) {
            return new VacuumCleaner(Integer.valueOf(params[0].split("=")[1]), //POWER_CONSUMPTION
                    Integer.valueOf(params[4].split("=")[1]), //MOTOR_SPEED_REGULATION
                    Integer.valueOf(params[5].split("=")[1]), //CLEANING_WIDTH
                    params[1].split("=")[1], //FILTER_TYPE
                    params[2].split("=")[1], //BAG_TYPE
                    params[3].split("=")[1]); //WAND_TYPE
        }
        return null;
    }

}
