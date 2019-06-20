package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.exception.DAOException;
import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplianceDAOImpl implements ApplianceDAO {

    public static final String path = "resources/appliances_db.txt";

    @Override
    public Appliance find(Criteria criteria) throws DAOException {

        Appliance appliance = null;
        boolean founded;
        String applianceDelims = " : ";
        String paramsDelims = ", ";

        try (FileReader fr = new FileReader(path);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            String[] tokens;
            String[] params;
            Set<String> keys = criteria.getCriteria().keySet();

            while ((line = br.readLine()) != null) {
                if (line.isEmpty()) {
                    continue;
                }

                tokens = line.split(applianceDelims, 2);
                String className = tokens[0];

                if (criteria.getGroupSearchName().equals(className)) {

                    params = tokens[1].split(paramsDelims);
                    founded = true;
                    for (String key : keys) {
                        
                        /* //  var.1 strings
                        String search = key + "=" + criteria.getCriteria().get(key);
                        if (!contains(Arrays.asList(params), search)) {
                            founded = false;
                        }
                        }*/
                        
                        //  var.2 regex
                        String search = (key + "=" + criteria.getCriteria().get(key)).toLowerCase();
                        Pattern searchRequest = Pattern.compile(search);
                        Matcher matcher = searchRequest.matcher(line.toLowerCase());
                        if (!matcher.find()) {
                            founded = false;
                            break;
                        }
                    }
                    if (founded) {
                        appliance = createAppliance(className, params);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new DAOException("File not found", e);
        } catch (IOException e) {
            throw new DAOException("IO problems", e);
        }

        return appliance;
    }

    public boolean contains(List<String> list, String s) {
        boolean flag = false;
        for (String string : list) {
            if (string.equalsIgnoreCase(s)) {
                flag = true;
            }
        }
        return flag;
    }

    private Appliance createAppliance(String className, String[] params) {

        if (className.equalsIgnoreCase(SearchCriteria.Laptop.class.getSimpleName())) {
            return new Laptop(Double.valueOf(params[0].split("=")[1]), //BATTERY_CAPACITY
                                Integer.valueOf(params[1].split("=")[1]), //MEMORY_ROM
                                Integer.valueOf(params[2].split("=")[1]), //SYSTEM_MEMORY
                                Double.valueOf(params[3].split("=")[1]), //CPU
                                Integer.valueOf(params[4].split("=")[1]),  //DISPLAY_INCHS
                                (params[5].split("=")[1])); //WIDTH
        }
        if (className.equalsIgnoreCase(SearchCriteria.Oven.class.getSimpleName())) {

            return new Oven(Integer.valueOf(params[0].split("=")[1]), //POWER_CONSUMPTION
                            Integer.valueOf(params[1].split("=")[1]), //WEIGHT
                            Integer.valueOf(params[2].split("=")[1]), //CAPACITY
                            Integer.valueOf(params[3].split("=")[1]), //DEPTH
                            Double.valueOf(params[4].split("=")[1]),  //HEIGHT
                            Double.valueOf(params[5].split("=")[1])); //WIDTH
        }
        if (className.equalsIgnoreCase(SearchCriteria.Refrigerator.class.getSimpleName())) {
            return new Refrigerator(Integer.valueOf(params[0].split("=")[1]), //POWER_CONSUMPTION
                                    Integer.valueOf(params[1].split("=")[1]), //WEIGHT
                                    Integer.valueOf(params[2].split("=")[1]), //FREEZER_CAPACITY
                                    Double.valueOf(params[3].split("=")[1]), //OVERALL_CAPACITY
                                    Double.valueOf(params[4].split("=")[1]),  //HEIGHT
                                    Double.valueOf(params[5].split("=")[1])); //WIDTH
        }
        if (className.equalsIgnoreCase(SearchCriteria.Speakers.class.getSimpleName())) {
            return new Speakers(Integer.valueOf(params[0].split("=")[1]), //POWER_CONSUMPTION
                                Integer.valueOf(params[1].split("=")[1]), //NUMBER_OF_SPEAKERS
                                Integer.valueOf(params[2].split("=")[1]), //CORD_LENGTH
                                params[3].split("=")[1]); //FREQUENCY_RANGE

        }
        if (className.equalsIgnoreCase(SearchCriteria.TabletPC.class.getSimpleName())) {
            return new TabletPC(Integer.valueOf(params[0].split("=")[1]), //BATTERY_CAPACITY
                                Integer.valueOf(params[1].split("=")[1]), //DISPLAY_INCHES
                                Integer.valueOf(params[2].split("=")[1]), //MEMORY_ROM
                                Integer.valueOf(params[3].split("=")[1]), //FLASH_MEMORY_CAPACITY
                                params[4].split("=")[1]); //COLOR
        }
        if (className.equalsIgnoreCase(SearchCriteria.VacuumCleaner.class.getSimpleName())) {
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

