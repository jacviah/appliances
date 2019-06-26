package by.tc.task01.dao.parser;

import by.tc.task01.entity.criteria.Criteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplianceDataParser {

    String paramsDelims = ", ";
    Criteria criteria;
    List<String> applianceData;

    public ApplianceDataParser(Criteria criteria, List<String> applianceData) {
        this.criteria = criteria;
        this.applianceData = applianceData;
    }

    public List<String> parse() {

        List<String> result = new ArrayList<>();
        List<Pattern> regExprs = formRegExFromCriteriaParameters();
        for (String i: applianceData) {
            if (isIncludeAllParameters(regExprs, i)) {
                result.add(i);
            }
        }
        return result;
    }

    private List<Pattern> formRegExFromCriteriaParameters() {

        List<Pattern> regExprs = new ArrayList<>();

        Set<String> keys = criteria.getCriteria().keySet();

        for (String key : keys) {
            String search = (key + "=" + criteria.getCriteria().get(key)).toLowerCase();
            Pattern searchRequest = Pattern.compile(search);
            regExprs.add(searchRequest);
        }

        return regExprs;
    }

    private boolean isIncludeAllParameters(List<Pattern> regExprs, String applData) {
        boolean result = true;
        for (Pattern i : regExprs) {
            Matcher matcher = i.matcher(applData.toLowerCase());
            if (!matcher.find()) {
                result = false;
                break;
            }
        }
        return result;
    }
}
