package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.Map;
import java.util.Set;

public class RefrigeratorValidator {

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
}
