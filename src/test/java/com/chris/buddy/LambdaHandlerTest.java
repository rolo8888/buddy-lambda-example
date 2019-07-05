package com.chris.buddy;

import org.junit.Assert;
import org.junit.Test;

public class LambdaHandlerTest {

    @Test
    public void runATest() {
        LambdaHandler handler = new LambdaHandler();
        String output = handler.handleRequest(10, null);
        Assert.assertEquals("Buddy says your number is 10", output);

        String secondOutput = handler.handleRequest(57, null);
        Assert.assertEquals("Buddy says your number is 57", secondOutput);
    }
}
