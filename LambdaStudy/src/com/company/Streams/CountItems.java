package com.company.Streams;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by atlassian on 5/7/17.
 */
public class CountItems {

    public static void main(String[] args) {
        System.out.println("Creating List:");
        List<String> strings = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            strings.add("Item "+ i);

        }

        long count = strings.stream().count();
        System.out.println("Count " + count);
    }


}


