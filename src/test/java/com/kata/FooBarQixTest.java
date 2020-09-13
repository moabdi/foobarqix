package com.kata;

import java.util.Map;
import java.util.stream.IntStream;

import org.junit.Assert;
import org.junit.Test;

public class FooBarQixTest {
    private static Map<Integer, String> DIGIT_MAP = Map.of(3, "Foo", 5, "Bar", 7, "Qix");

    @Test
    public void should_toFooBarQix_work_as_nativeFooBarQix() {
        IntStream.rangeClosed(1, 100)
                .forEach(number -> Assert.assertEquals(FooBarQix.toFooBarQix(number), nativeFooBarQix(number)));
    }

    private static String nativeFooBarQix(int number) {
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
