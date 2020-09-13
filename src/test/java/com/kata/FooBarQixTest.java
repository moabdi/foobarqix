package com.kata;

import org.junit.Assert;
import org.junit.Test;

public class FooBarQixTest {

    @Test
    public void should_toFooBarQix_return_Foo() {
        Assert.assertEquals(FooBarQix.toFooBarQix(6), "Foo");
        Assert.assertEquals(FooBarQix.toFooBarQix(13), "Foo");
        Assert.assertEquals(FooBarQix.toFooBarQix(33), "FooFooFoo");
    }

    @Test
    public void should_toFooBarQix_return_Bar() {
        Assert.assertEquals(FooBarQix.toFooBarQix(10), "Bar");
        Assert.assertEquals(FooBarQix.toFooBarQix(5), "BarBar");
        Assert.assertEquals(FooBarQix.toFooBarQix(55), "BarBarBar");
    }

    @Test
    public void should_toFooBarQix_return_Qix() {
        Assert.assertEquals(FooBarQix.toFooBarQix(14), "Qix");
        Assert.assertEquals(FooBarQix.toFooBarQix(7), "QixQix");
        Assert.assertEquals(FooBarQix.toFooBarQix(77), "QixQixQix");
    }

    @Test
    public void should_toFooBarQix_return_FooAndBar() {
        Assert.assertEquals(FooBarQix.toFooBarQix(15), "FooBarBar");
        Assert.assertEquals(FooBarQix.toFooBarQix(30), "FooBarFoo");
        Assert.assertEquals(FooBarQix.toFooBarQix(53), "BarFoo");
    }

    @Test
    public void should_toFooBarQix_return_FooAndQix() {
        Assert.assertEquals(FooBarQix.toFooBarQix(21), "FooQix");
    }

    @Test
    public void should_toFooBarQix_return_BarAndQix() {
        Assert.assertEquals(FooBarQix.toFooBarQix(70), "BarQixQix");
    }
}
