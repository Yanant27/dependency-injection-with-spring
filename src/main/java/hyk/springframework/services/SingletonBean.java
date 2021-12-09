package hyk.springframework.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
    public SingletonBean() {
        System.out.println("Creating singleton bean !!!");
    }
    public String getMyScope() {
        return "Singleton Bean Scope";
    }
}
