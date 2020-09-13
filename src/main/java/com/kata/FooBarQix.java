package com.kata;

import java.util.Map;

public class FooBarQix {

    private static Map<Integer, String> DIGIT_MAP = Map.of(3, "Foo", 5, "Bar", 7, "Qix");

    public static String toFooBarQix(int number) {

        StringBuilder result = new StringBuilder().append(number % 3 == 0 ? "Foo" : "")
                .append(number % 5 == 0 ? "Bar" : "").append(number % 7 == 0 ? "Qix" : "");

        String num = String.valueOf(number);
        for (int i = 0; i < num.length(); i++) {
            char value = num.charAt(i);
            result.append(DIGIT_MAP.getOrDefault(Character.getNumericValue(value), ""));
        }

        return result.toString().isEmpty() ? num : result.toString();
    }
}
