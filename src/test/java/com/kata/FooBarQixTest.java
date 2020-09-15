package com.kata;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FooBarQixTest {

    @Test
    public void should_toFooBarQix_return_Foo() {
        assertEquals("Foo", FooBarQix.toFooBarQix(13));
        assertEquals("Foo", FooBarQix.toFooBarQix(6));
        assertEquals("FooFoo", FooBarQix.toFooBarQix(3));
        assertEquals("FooFooFoo", FooBarQix.toFooBarQix(33));
    }

    @Test
    public void should_toFooBarQix_return_Bar() {
        assertEquals("Bar", FooBarQix.toFooBarQix(10));
        assertEquals("BarBar", FooBarQix.toFooBarQix(5));
        assertEquals("BarBarBar", FooBarQix.toFooBarQix(55));
    }

    @Test
    public void should_toFooBarQix_return_Qix() {
        assertEquals("Qix", FooBarQix.toFooBarQix(7));
        assertEquals("QixQix", FooBarQix.toFooBarQix(77));
    }

    @Test
    public void should_toFooBarQix_return_FooBarQix() {
        assertEquals("FooBarBar", FooBarQix.toFooBarQix(15));
        assertEquals("FooQix", FooBarQix.toFooBarQix(27));
        assertEquals("BarFoo", FooBarQix.toFooBarQix(53));
        assertEquals("BarFooBar", FooBarQix.toFooBarQix(35));
        assertEquals("FooBarQixBar", FooBarQix.toFooBarQix(75));
    }

    @Test
    public void should_toFooBarQix_return_same_value() {
        assertEquals("1", FooBarQix.toFooBarQix(1));
        assertEquals("14", FooBarQix.toFooBarQix(14));
    }
}
