package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VacuumCleanerValidator {

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
                case "FILTER_TYPE":
                    Pattern searchRequest = Pattern.compile("[^ABC]");
                    Matcher matcher = searchRequest.matcher(String.valueOf(params.get(key)));
                    if (matcher.matches()) {
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
