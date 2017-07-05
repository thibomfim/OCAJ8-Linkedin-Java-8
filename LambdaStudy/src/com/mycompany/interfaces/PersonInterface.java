package com.mycompany.interfaces;

import com.company.Person;

/**
 * Created by atlassian on 5/7/17.
 */
public interface PersonInterface {

    String getName();
    void setName(String name);
    int getAge();
    void setAge(int age);

    default String getPersonInfo(){
        return getName() + "(" + getAge() + ")";
    }

    static String getPersonInfoStatic(Person p){
        return p.getName() + "(" + p.getAge() + ")";
    }

}
