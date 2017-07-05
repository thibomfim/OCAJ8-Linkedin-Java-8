package com.company;

import com.mycompany.interfaces.PersonInterface;

/**
 * Created by atlassian on 4/7/17.
 */
public class Person implements PersonInterface{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return getName() + "(" + getAge() + ")";
    }

    public static int compareAges(Person p1, Person p2){
        Integer age1 = p1.getAge();
        return age1.compareTo(p2.getAge());
    }
}
