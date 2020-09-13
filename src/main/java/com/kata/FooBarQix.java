package com.kata;

import static java.util.stream.Collectors.joining;
import static java.lang.Character.getNumericValue;

import java.util.Map;
import java.util.TreeMap;

public class FooBarQix {

    static Map<Integer, String> DIGIT_MAP;

    static {
        DIGIT_MAP = new TreeMap<>();
        DIGIT_MAP.put(3, "Foo");
        DIGIT_MAP.put(5, "Bar");
        DIGIT_MAP.put(7, "Qix");
    }

    public static String toFooBarQix(int value) {
        String result = "";
        result += modulo(value);
        result += contains(value);
        return result.isEmpty() ? String.valueOf(value) : result;
    }

    private static String modulo(int value) {
        return DIGIT_MAP.keySet().stream().filter(key -> value % key == 0).map(DIGIT_MAP::get).collect(joining());
    }

    private static String contains(int value) {
        return String.valueOf(value).codePoints()
                .mapToObj(intAsChar -> DIGIT_MAP.getOrDefault(getNumericValue(intAsChar), "")).collect(joining());
    }
}
