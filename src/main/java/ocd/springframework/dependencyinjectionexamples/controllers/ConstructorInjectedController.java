package ocd.springframework.dependencyinjectionexamples.controllers;

import ocd.springframework.dependencyinjectionexamples.services.GreetingService;

public class ConstructorInjectedController {

    // MOST preferred method

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
