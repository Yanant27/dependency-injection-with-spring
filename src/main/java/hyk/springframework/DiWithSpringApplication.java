package hyk.springframework;

import hyk.springframework.controllers.*;
import hyk.springframework.services.PrototypeBean;
import hyk.springframework.services.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Htoo Yanant Khin
 */
@ComponentScan({"com.springframework.pet.service", "hyk.springframework"})
@SpringBootApplication
public class DiWithSpringApplication {

    public static void main(String[] args) {
        // All print lines of this class will be 7th.
        ApplicationContext ctx = SpringApplication.run(DiWithSpringApplication.class, args);
        System.out.println("****************Primary Bean****************");
        /* Don't need to create controller object with new keyword
         * The Spring Framework is managing the construction of myController
         */
        MyController myController = (MyController) ctx.getBean("myController");
        String greeting = myController.sayHello();
        System.out.println(greeting);

        System.out.println("****************Pet Controller****************");
        PetController petController = ctx.getBean( "petController", PetController.class);
        System.out.println("--- The Best Pet is ---");
        System.out.println(petController.whichPetIsTheBest());

        System.out.println("****************Profile****************");
        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayHello());

        System.out.println("****************Property Injection****************");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController)ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.sayHello());

        System.out.println("****************Setter Injection****************");
        SetterInjectedController setterInjectedController = (SetterInjectedController)ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.sayHello());

        System.out.println("****************Constructor Injection****************");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.sayHello());

        System.out.println("****************Singleton Bean****************");
        SingletonBean singletonBean1 = ctx.getBean(SingletonBean.class);
        System.out.println(singletonBean1.getMyScope());
        SingletonBean singletonBean2 = ctx.getBean(SingletonBean.class);
        System.out.println(singletonBean2.getMyScope());

        System.out.println("****************Prototype Bean****************");
        PrototypeBean prototypeBean1 = ctx.getBean(PrototypeBean.class);
        System.out.println(prototypeBean1.getMyScope());
        PrototypeBean prototypeBean2 = ctx.getBean(PrototypeBean.class);
        System.out.println(prototypeBean2.getMyScope());
    }

}
