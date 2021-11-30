package hyk.springframework.controllers;

import hyk.springframework.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Htoo Yanant Khin
 */
class PropertyInjectedControllerTest {
    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        // Manual property injection (the least preferred method)
        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void sayHello() {
        System.out.println(controller);
    }
}