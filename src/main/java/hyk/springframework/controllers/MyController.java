package hyk.springframework.controllers;

import hyk.springframework.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * @author Htoo Yanant Khin
 */
@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
