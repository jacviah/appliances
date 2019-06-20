package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TabletPCValidator {

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
                    if (!matcher.matches()) {
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
