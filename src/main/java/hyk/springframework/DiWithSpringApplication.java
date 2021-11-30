package hyk.springframework;

import hyk.springframework.controllers.ConstructorInjectedController;
import hyk.springframework.controllers.MyController;
import hyk.springframework.controllers.PropertyInjectedController;
import hyk.springframework.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Htoo Yanant Khin
 */
@SpringBootApplication
public class DiWithSpringApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiWithSpringApplication.class, args);
        /* Don't need to create controller object with new keyword
         * The Spring Framework is managing the construction of myController
         */
        MyController myController = (MyController) ctx.getBean("myController");
        String greeting = myController.sayHello();
        System.out.println(greeting);

        System.out.println("****************Property Injection****************");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController)ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.sayHello());
        System.out.println("****************Setter Injection****************");
        SetterInjectedController setterInjectedController = (SetterInjectedController)ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.sayHello());
        System.out.println("****************Constructor Injection****************");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.sayHello());
    }

}
