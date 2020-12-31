package com.iago.picos.greetings.greeting;

import lombok.*;
import org.springframework.boot.jackson.JsonComponent;

import java.util.UUID;


@Getter
@Setter
@ToString
public class Greeting {
    @NonNull
    private String id;
    @NonNull
    private String message;

    public Greeting(@NonNull String message) {
        this.id= UUID.randomUUID().toString();
        this.message = message;
    }
}
