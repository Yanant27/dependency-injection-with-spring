package hyk.springframework.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author Htoo Yanant Khin
 */
@Controller
public class MyController {
    public String sayHello() {
        return "Hellow World !";
    }
}
