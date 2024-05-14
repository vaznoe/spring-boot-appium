package com.vaznoe.thescore.utils;

import java.util.stream.Stream;

public class TestUtils {
    public static String leaguesName(String name) {
        if (Stream.of("NFL Football", "NBA Basketball", "MLB Baseball", "NHL Hockey").anyMatch(s -> name.equals(s))) {
            return name.split(" ")[0].toUpperCase();
        } else {
            return name.toUpperCase();
        }
    }
}
