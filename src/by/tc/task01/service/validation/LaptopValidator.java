package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.Map;
import java.util.Set;

public class LaptopValidator {

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
}
