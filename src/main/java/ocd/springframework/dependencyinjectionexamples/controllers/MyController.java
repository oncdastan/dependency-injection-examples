package ocd.springframework.dependencyinjectionexamples.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    /*
            Spring creates an instance of this class,
        then puts it inside the context.
    */

    public String sayHello() {
        System.out.println("Hello World!");

        return "Hi!";
    }

}
