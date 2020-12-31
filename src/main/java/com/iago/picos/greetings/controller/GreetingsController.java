package com.iago.picos.greetings.controller;

import com.iago.picos.greetings.greeting.Greeting;
import com.iago.picos.greetings.repository.GreetingRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
public class GreetingsController {

    private final GreetingRepository greetingRepository;

    public GreetingsController(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @RequestMapping(value = "/world", method = RequestMethod.GET)
    @ResponseBody
    public Greeting getGreeting() {
        return greetingRepository.getGreetings("null");

    }
}

