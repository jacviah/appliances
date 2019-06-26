package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.ApplianceFactory;
import by.tc.task01.dao.exceptions.DAOException;
import by.tc.task01.dao.parser.ApplianceDataParser;
import by.tc.task01.dao.readers.ApplianceFileReader;
import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;


import java.util.ArrayList;
import java.util.List;


public class ApplianceDAOImpl implements ApplianceDAO {

    public static final String path = "resources/appliances_db.txt";

    @Override
    public List<Appliance> find(Criteria criteria) throws DAOException {

        Appliance appliance = null;
        boolean founded;

        String applianceType = criteria.getGroupSearchName();
        List<String> applianceData = readApplianceData(applianceType);
        List<String> found = selectAppliancesMatchingCriteria(criteria, applianceData);
        List<Appliance> applianceList = new ArrayList<>();

        for (String i: found) {
            applianceList.add(ApplianceFactory.create(applianceType, i));
        }

        return applianceList;
    }

    private List<String> readApplianceData(String type) throws DAOException {

        ApplianceFileReader reader = new ApplianceFileReader();
        List<String> data = reader.read(type);
        return data;
    }

    private List<String> selectAppliancesMatchingCriteria(Criteria criteria, List<String> data) throws DAOException {

        ApplianceDataParser parser = new ApplianceDataParser(criteria, data);
        return parser.parse();
    }

}

