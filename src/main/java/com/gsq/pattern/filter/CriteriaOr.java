package com.gsq.pattern.filter;

import java.util.List;

/**
 * 过滤器模式
 */
public class CriteriaOr implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public CriteriaOr(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstPersons = criteria.meetCriteria(persons);
        List<Person> secondPersons = otherCriteria.meetCriteria(persons);

        for (Person person : firstPersons) {
            if (!secondPersons.contains(person)) {
                secondPersons.add(person);
            }
        }

        return secondPersons;
    }
}
