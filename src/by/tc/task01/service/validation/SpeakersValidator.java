package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.Map;
import java.util.Set;

public class SpeakersValidator {

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
}
