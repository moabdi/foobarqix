package com.kata;

import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100).mapToObj(FooBarQix::toFooBarQix).forEach(System.out::println);
    }
}
