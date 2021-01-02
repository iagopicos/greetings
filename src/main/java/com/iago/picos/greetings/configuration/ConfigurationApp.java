package com.iago.picos.greetings.configuration;

import com.iago.picos.greetings.controller.GreetingsController;
import com.iago.picos.greetings.repository.DryRepository;
import com.iago.picos.greetings.repository.GreetingRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ConfigurationApp {
    @Bean
    @Profile("dryRun")
    public GreetingRepository greetingRepository(){
        return new DryRepository();
    }


}
