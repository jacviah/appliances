package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.Map;
import java.util.Set;

public class OvenValidator {

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

}
