package hyk.springframework;

import hyk.springframework.controllers.MyController;
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
    }

}
