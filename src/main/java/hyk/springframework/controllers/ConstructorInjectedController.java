package hyk.springframework.controllers;

import hyk.springframework.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * @author Htoo Yanant Khin
 */
@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    /*
     * @Autowired is no longer required for constructor since Spring 4.2 (not sure for version no.)
     * It works well without @Autowired annotation in Spring 5
     */
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
