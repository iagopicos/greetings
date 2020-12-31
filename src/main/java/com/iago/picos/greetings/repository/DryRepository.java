package com.iago.picos.greetings.repository;

import com.iago.picos.greetings.greeting.Greeting;
public class DryRepository implements GreetingRepository {

    Greeting greeting;

    @Override
    public Greeting getGreetings(String id) {
        greeting = new Greeting("Hello World");
        return greeting;
    }
}
