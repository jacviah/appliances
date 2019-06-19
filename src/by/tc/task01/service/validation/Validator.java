package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validator {

    public static boolean criteriaValidator(Criteria criteria) {

        if (criteria.getCriteria().isEmpty()) {
            return false;
        }

        if (criteria.getGroupSearchName().equalsIgnoreCase(SearchCriteria.Oven.class.getSimpleName())) {
            return  ovenCriteriaValidator(criteria);
        }

        if (criteria.getGroupSearchName().equalsIgnoreCase(SearchCriteria.TabletPC.class.getSimpleName())) {
            return  tabletPCCriteriaValidator(criteria);
        }

        if (criteria.getGroupSearchName().equalsIgnoreCase(SearchCriteria.Laptop.class.getSimpleName())) {
            return  laptopCriteriaValidator(criteria);
        }

        if (criteria.getGroupSearchName().equalsIgnoreCase(SearchCriteria.Refrigerator.class.getSimpleName())) {
            return  refrigeratorCriteriaValidator(criteria);
        }

        if (criteria.getGroupSearchName().equalsIgnoreCase(SearchCriteria.Speakers.class.getSimpleName())) {
            return  speakersCriteriaValidator(criteria);
        }

        if (criteria.getGroupSearchName().equalsIgnoreCase(SearchCriteria.VacuumCleaner.class.getSimpleName())) {
            return  vacuumCleanerCriteriaValidator(criteria);
        }

        return false;
    }

    public static boolean ovenCriteriaValidator(Criteria criteria) {
        Map<String, Object> params = criteria.getCriteria();
        Set<String> keySet = criteria.getCriteria().keySet();
        for (String key : keySet) {
            switch (key) {
                case "POWER_CONSUMPTION":
                    if (Integer.valueOf(String.valueOf(params.get(key))) < 0 || Integer.valueOf(String.valueOf(params.get(key))) > 10000) {
                        return false;
                    }
                    break;
                case "WEIGHT":
                    if (Integer.valueOf(String.valueOf(params.get(key))) < 0 || Integer.valueOf(String.valueOf(params.get(key))) > 100) {
                        return false;
                    }
                    break;
                case "CAPACITY":
                    if (Integer.valueOf(String.valueOf(params.get(key))) < 0 || Integer.valueOf(String.valueOf(params.get(key))) > 100) {
                        return false;
                    }
                    break;
                case "DEPTH":
                    if (Integer.valueOf(String.valueOf(params.get(key))) < 0 || Integer.valueOf(String.valueOf(params.get(key))) > 100) {
                        return false;
                    }
                    break;
                case "HEIGHT":
                    if (Double.valueOf(String.valueOf(params.get(key))) < 0 || Double.valueOf(String.valueOf(params.get(key))) > 100) {
                        return false;
                    }
                    break;
                case "WIDTH":
                    if (Double.valueOf(String.valueOf(params.get(key))) < 0 || Double.valueOf(String.valueOf(params.get(key))) > 100) {
                        return false;
                    }
                    break;
                default:
                    return true;
            }
        }
        return true;
    }

    public static boolean tabletPCCriteriaValidator(Criteria criteria) {
        Map<String, Object> params = criteria.getCriteria();
        Set<String> keySet = criteria.getCriteria().keySet();
        for (String key : keySet) {
            switch (key) {
                case "BATTERY_CAPACITY":
                    if (Integer.valueOf(String.valueOf(params.get(key))) < 0 || Integer.valueOf(String.valueOf(params.get(key))) > 10) {
                        return false;
                    }
                    break;
                case "DISPLAY_INCHES":
                    if (Integer.valueOf(String.valueOf(params.get(key))) < 10 || Integer.valueOf(String.valueOf(params.get(key))) > 70) {
                        return false;
                    }
                    break;
                case "MEMORY_ROM":
                    if (Integer.valueOf(String.valueOf(params.get(key))) < 1000 || Integer.valueOf(String.valueOf(params.get(key))) > 40000) {
                        return false;
                    }
                    break;
                case "FLASH_MEMORY_CAPACITY":
                    if (Integer.valueOf(String.valueOf(params.get(key))) < 0 || Integer.valueOf(String.valueOf(params.get(key))) > 20) {
                        return false;
                    }
                    break;
                case "COLOR":
                    Pattern searchRequest = Pattern.compile("^[a-zA-Z]+$");
                    Matcher matcher = searchRequest.matcher(String.valueOf(params.get(key)));
                    if(!matcher.find()) {
                        return false;
                    }
                    break;
                default:
                    return true;
            }
        }
        return true;
    }

    public static boolean laptopCriteriaValidator(Criteria criteria) {
        Map<String, Object> params = criteria.getCriteria();
        Set<String> keySet = criteria.getCriteria().keySet();
        for (String key : keySet) {
            switch (key) {
                case "BATTERY_CAPACITY":
                    if (Double.valueOf(String.valueOf(params.get(key))) < 0 || Double.valueOf(String.valueOf(params.get(key))) > 10) {
                        return false;
                    }
                    break;
                case "MEMORY_ROM":
                    if (Integer.valueOf(String.valueOf(params.get(key))) < 1000 || Integer.valueOf(String.valueOf(params.get(key))) > 40000) {
                        return false;
                    }
                    break;
                case "SYSTEM_MEMORY":
                    if (Integer.valueOf(String.valueOf(params.get(key))) < 1000 || Integer.valueOf(String.valueOf(params.get(key))) > 40000) {
                        return false;
                    }
                    break;
                case "CPU":
                    if (Integer.valueOf(String.valueOf(params.get(key))) < 0 || Integer.valueOf(String.valueOf(params.get(key))) > 100) {
                        return false;
                    }
                    break;
                case "DISPLAY_INCHS":
                    if (Double.valueOf(String.valueOf(params.get(key))) < 10 || Double.valueOf(String.valueOf(params.get(key))) > 70) {
                        return false;
                    }
                    break;
                default:
                    return true;
            }
        }
        return true;
    }

    public static boolean refrigeratorCriteriaValidator(Criteria criteria) {
        Map<String, Object> params = criteria.getCriteria();
        Set<String> keySet = criteria.getCriteria().keySet();
        for (String key : keySet) {
            switch (key) {
                case "POWER_CONSUMPTION":
                    if (Integer.valueOf(String.valueOf(params.get(key))) < 50 || Integer.valueOf(String.valueOf(params.get(key))) > 1000) {
                        return false;
                    }
                    break;
                case "WEIGHT":
                    if (Integer.valueOf(String.valueOf(params.get(key))) < 10 || Integer.valueOf(String.valueOf(params.get(key))) > 100) {
                        return false;
                    }
                    break;
                case "FREEZER_CAPACITY":
                    if (Integer.valueOf(String.valueOf(params.get(key))) < 0 || Integer.valueOf(String.valueOf(params.get(key))) > 100) {
                        return false;
                    }
                    break;
                case "OVERALL_CAPACITY":
                    if (Double.valueOf(String.valueOf(params.get(key))) < 100 || Double.valueOf(String.valueOf(params.get(key))) > 1000) {
                        return false;
                    }
                    break;
                case "HEIGHT":
                    if (Double.valueOf(String.valueOf(params.get(key))) < 100 || Double.valueOf(String.valueOf(params.get(key))) > 300) {
                        return false;
                    }
                    break;
                case "WIDTH":
                    if (Double.valueOf(String.valueOf(params.get(key))) < 40 || Double.valueOf(String.valueOf(params.get(key))) > 100) {
                        return false;
                    }
                    break;
                default:
                    return true;
            }
        }
        return true;
    }

    public static boolean speakersCriteriaValidator(Criteria criteria) {
        Map<String, Object> params = criteria.getCriteria();
        Set<String> keySet = criteria.getCriteria().keySet();
        for (String key : keySet) {
            switch (key) {
                case "POWER_CONSUMPTION":
                    if (Integer.valueOf(String.valueOf(params.get(key))) < 5 || Integer.valueOf(String.valueOf(params.get(key))) > 100) {
                        return false;
                    }
                    break;
                case "NUMBER_OF_SPEAKERS":
                    if (Integer.valueOf(String.valueOf(params.get(key))) < 0 || Integer.valueOf(String.valueOf(params.get(key))) > 10) {
                        return false;
                    }
                    break;
                case "CORD_LENGTH":
                    if (Integer.valueOf(String.valueOf(params.get(key))) < 0 || Integer.valueOf(String.valueOf(params.get(key))) > 10) {
                        return false;
                    }
                    break;
                default:
                    return true;
            }
        }
        return true;
    }

    public static boolean vacuumCleanerCriteriaValidator(Criteria criteria) {
        Map<String, Object> params = criteria.getCriteria();
        Set<String> keySet = criteria.getCriteria().keySet();
        for (String key : keySet) {
            switch (key) {
                case "POWER_CONSUMPTION":
                    if (Integer.valueOf(String.valueOf(params.get(key))) < 0 || Integer.valueOf(String.valueOf(params.get(key))) > 1000) {
                        return false;
                    }
                    break;
                case "MOTOR_SPEED_REGULATION":
                    if (Integer.valueOf(String.valueOf(params.get(key))) < 0 || Integer.valueOf(String.valueOf(params.get(key))) > 100) {
                        return false;
                    }
                    break;
                case "CLEANING_WIDTH":
                    if (Integer.valueOf(String.valueOf(params.get(key))) < 1000 || Integer.valueOf(String.valueOf(params.get(key))) > 1000) {
                        return false;
                    }
                    break;
                default:
                    return true;
            }
        }
        return true;
    }
}