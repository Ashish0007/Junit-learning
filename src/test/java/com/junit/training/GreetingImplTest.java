package com.junit.training;

import org.junit.Assert;
import org.junit.Test;

public class GreetingImplTest {

    @Test
    public void testGreet() {

        GreetingImpl greeting = new GreetingImpl();
        String result = greeting.greet("unit-test");
        Assert.assertNotNull(result);
        Assert.assertTrue("Hello unit-test".equals(result));
    }

    @Test(expected = IllegalArgumentException.class)
    public void greet_should_throw_illegalArguementException(){
        Greeting greeting = new GreetingImpl();
        greeting.greet(null);
    }
}