package ocd.springframework.dependencyinjectionexamples.controllers;

import ocd.springframework.dependencyinjectionexamples.services.GreetingService;

public class PropertyInjectedController {

    // LEAST preferred method

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
