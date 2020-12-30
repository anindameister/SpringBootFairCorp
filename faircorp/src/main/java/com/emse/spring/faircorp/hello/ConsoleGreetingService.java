package com.emse.spring.faircorp.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Service("one")
//@Primary
@Service
public class ConsoleGreetingService implements GreetingService{

//    private final CycleService cycleService;
//    @Autowired
//    public ConsoleGreetingService(CycleService cycleService) {
//        this.cycleService = cycleService;
//    }

    public ConsoleGreetingService( ) {

    }

    @Override
    public void greet(String name) {
        System.out.println("Hello, "+name+"!");
    }
}
