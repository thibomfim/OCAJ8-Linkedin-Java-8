package com.company.lambdabasics;

import com.company.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by atlassian on 5/7/17.
 */
public class PredicateInner {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Joe",48));
        people.add(new Person("Mary",30));
        people.add(new Person("Mike",73));

        Predicate<Person> predOlder = person -> person.getAge() >= 60;
        Predicate<Person> predYounger = person -> person.getAge() <= 40;


        displayPeople(people, predYounger);


    }

    private static void displayPeople(List<Person> people, Predicate<Person> pred) {
        people.forEach(p -> {
            if(pred.test(p)){
                System.out.println(p);
            }
        });
    }
}
