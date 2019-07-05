package com.chris.buddy;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaHandler implements RequestHandler<Integer, String>{
    public String handleRequest(Integer myCount, Context context) {
        System.out.println("I am a lambda and I have been invoked!");
        return "Buddy says your number is " + String.valueOf(myCount);
    }
}
