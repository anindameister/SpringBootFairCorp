package com.emse.spring.faircorp.hello;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(OutputCaptureExtension.class) // (1)
@ExtendWith(SpringExtension.class) // (1)
class GreetingServiceTest {
    @Configuration // (2)
    @ComponentScan("com.emse.spring.faircorp.hello")
    public static class GreetingServiceTestConfig{}

    @Autowired // (3)
    public GreetingService greetingService;

    @Test
    public void testGreeting(CapturedOutput output) {
//        GreetingService greetingService = new ConsoleGreetingService(); // (2)

        greetingService.greet("Spring");
        Assertions.assertThat(output.getAll()).contains("Bonjour, Spring!");
    }
}