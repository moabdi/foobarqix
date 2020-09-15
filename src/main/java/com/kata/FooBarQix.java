package com.kata;

import static java.util.stream.Collectors.joining;
import static java.lang.Character.getNumericValue;

import java.util.Map;
import java.util.TreeMap;

public class FooBarQix {

    private static Map<Integer, String> DIV_MAP;
    private static Map<Integer, String> CONT_MAP;

    static {
        DIV_MAP = new TreeMap<>();
        DIV_MAP.put(3, "Foo");
        DIV_MAP.put(5, "Bar");
        CONT_MAP = new TreeMap<>(DIV_MAP);
        CONT_MAP.put(7, "Qix");
    }

    public static String toFooBarQix(int value) {
        String result = "";
        result += modulo(value);
        result += contains(value);
        return result.isEmpty() ? String.valueOf(value) : result;
    }

    private static String modulo(int value) {
        return DIV_MAP.keySet().stream().filter(key -> value % key == 0).map(DIV_MAP::get).collect(joining());
    }

    private static String contains(int value) {
        return String.valueOf(value).codePoints()
                .mapToObj(intAsChar -> CONT_MAP.getOrDefault(getNumericValue(intAsChar), "")).collect(joining());
    }
}
