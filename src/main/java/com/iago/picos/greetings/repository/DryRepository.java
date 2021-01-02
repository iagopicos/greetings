package com.iago.picos.greetings.repository;

import com.iago.picos.greetings.greeting.Greeting;
import org.springframework.beans.factory.annotation.Value;

public class DryRepository implements GreetingRepository {

    @Value("${default.msg:Hello World}")
    private String defaultMsg;
    private Greeting greeting;

    @Override
    public Greeting getGreetings() {
        greeting = new Greeting(defaultMsg);
        return greeting;
    }
}
