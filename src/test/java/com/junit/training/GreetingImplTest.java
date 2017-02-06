package com.junit.training;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GreetingImplTest {

    GreetingImpl greeting;
    @Before
    public void setUp(){
         greeting = new GreetingImpl();
    }
    @Test
    public void testGreet() {


        String result = greeting.greet("unit-test");
        Assert.assertNotNull(result);
        Assert.assertTrue("Hello unit-test".equals(result));
    }

    @Test(expected = IllegalArgumentException.class)
    public void greet_should_throw_illegalArguementException(){
        greeting.greet(null);
    }
}