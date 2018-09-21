package com.gsq.pattern.filter;

import java.util.List;

/**
 * 过滤器模式
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
