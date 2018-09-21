package com.gsq.pattern.filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 过滤器模式
 */
public class CriteriaMale implements Criteria {

    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream()
                .filter(person -> person.getGender().equalsIgnoreCase("MALE"))
                .collect(Collectors.toList());
    }
}
