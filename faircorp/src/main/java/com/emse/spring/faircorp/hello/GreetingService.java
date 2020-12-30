package com.emse.spring.faircorp.hello;

import org.springframework.stereotype.Component;

@Component
public interface GreetingService {
    void greet(String name);
}
