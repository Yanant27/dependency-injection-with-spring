package hyk.springframework.controllers;

import hyk.springframework.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {
    private ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        // Manual constructor injection (the most preferred method)
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}