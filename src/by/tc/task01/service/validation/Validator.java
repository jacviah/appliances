package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import static by.tc.task01.service.validation.LaptopValidator.laptopCriteriaValidator;
import static by.tc.task01.service.validation.OvenValidator.ovenCriteriaValidator;
import static by.tc.task01.service.validation.RefrigeratorValidator.refrigeratorCriteriaValidator;
import static by.tc.task01.service.validation.SpeakersValidator.speakersCriteriaValidator;
import static by.tc.task01.service.validation.TabletPCValidator.tabletPCCriteriaValidator;
import static by.tc.task01.service.validation.VacuumCleanerValidator.vacuumCleanerCriteriaValidator;

public class Validator {

    public static boolean criteriaValidator(Criteria criteria) {

        if (criteria.getCriteria().isEmpty()) {
            return false;
        }

        if (criteria.getGroupSearchName().equalsIgnoreCase(SearchCriteria.Oven.class.getSimpleName())) {
            return ovenCriteriaValidator(criteria);
        }

        if (criteria.getGroupSearchName().equalsIgnoreCase(SearchCriteria.TabletPC.class.getSimpleName())) {
            return tabletPCCriteriaValidator(criteria);
        }

        if (criteria.getGroupSearchName().equalsIgnoreCase(SearchCriteria.Laptop.class.getSimpleName())) {
            return laptopCriteriaValidator(criteria);
        }

        if (criteria.getGroupSearchName().equalsIgnoreCase(SearchCriteria.Refrigerator.class.getSimpleName())) {
            return refrigeratorCriteriaValidator(criteria);
        }

        if (criteria.getGroupSearchName().equalsIgnoreCase(SearchCriteria.Speakers.class.getSimpleName())) {
            return speakersCriteriaValidator(criteria);
        }

        if (criteria.getGroupSearchName().equalsIgnoreCase(SearchCriteria.VacuumCleaner.class.getSimpleName())) {
            return vacuumCleanerCriteriaValidator(criteria);
        }

        return false;
    }
}