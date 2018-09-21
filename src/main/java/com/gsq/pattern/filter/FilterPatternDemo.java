package com.gsq.pattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器模式
 */
public class FilterPatternDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Robert","Male",   "Single"));
        persons.add(new Person("John",  "Male",   "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike",  "Male",   "Single"));
        persons.add(new Person("Bobby", "Male",   "Single"));

        CriteriaMale criteriaMale = new CriteriaMale();
        CriteriaFemale criteriaFemale = new CriteriaFemale();
        CriteriaSingle criteriaSingle = new CriteriaSingle();
        CriteriaAnd criteriaAnd = new CriteriaAnd(criteriaSingle, criteriaMale);
        CriteriaOr criteriaOr = new CriteriaOr(criteriaSingle, criteriaFemale);

        System.out.println("Males: ");
        printPersons(criteriaMale.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(criteriaFemale.meetCriteria(persons));

        System.out.println("\nSingle: ");
        printPersons(criteriaSingle.meetCriteria(persons));

        System.out.println("\nAnd: ");
        printPersons(criteriaAnd.meetCriteria(persons));

        System.out.println("\nOr: ");
        printPersons(criteriaOr.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }
}
