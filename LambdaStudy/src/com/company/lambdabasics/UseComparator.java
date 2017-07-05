package com.company.lambdabasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by atlassian on 5/7/17.
 */
public class UseComparator {

    public static void main(String[] args) {
        List<String > strings = new ArrayList<>();
        strings.add("AAA");
        strings.add("bbb");
        strings.add("CCC");
        strings.add("ddd");
        strings.add("EEE");

        Collections.sort(strings);

        System.out.println("Simple sort");
        strings.forEach(System.out::println);


        Comparator<String> comp = (str2, str3) -> str2.compareToIgnoreCase(str3);
        Collections.sort(strings, comp);
        //Collections.sort(strings, (str1, str2)-> str1.compareToIgnoreCase(str2));

        System.out.println("Sort with comparator");
        strings.forEach(System.out::println);

    }

}
