package hyk.springframework.controllers;

import hyk.springframework.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {
    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        // Manual setter injection
        controller.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}