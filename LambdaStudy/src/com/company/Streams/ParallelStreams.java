package com.company.Streams;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by atlassian on 5/7/17.
 */
public class ParallelStreams {
    public static void main(String[] args) {

        System.out.println("Creating List:");
        List<String> strings = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            strings.add("Item "+ i);

        }

        strings.stream()
                .parallel()
                .forEach(s -> System.out.println(s));
    }
}
