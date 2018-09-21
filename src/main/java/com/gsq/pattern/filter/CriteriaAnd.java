package com.gsq.pattern.filter;

import java.util.List;

/**
 * 过滤器模式
 */
public class CriteriaAnd implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public CriteriaAnd(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> tPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(tPersons);
    }
}
