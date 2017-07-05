package com.company.Streams;

import com.company.Person;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by atlassian on 5/7/17.
 */
public class ArrayToStream {

    public static void main(String[] args) {
        Person[] people ={
        new Person("Joe", 48),
        new Person("Mary", 30),
        new Person("Mike", 73)
        };

//        for (int i = 0; i < people.length; i++) {
//            System.out.println(people[i]);
//        }

        //Stream<Person> stream = Stream.of(people);
        Stream<Person> stream = Arrays.stream(people);

        stream.forEach(person -> System.out.println(person));
    }
}
