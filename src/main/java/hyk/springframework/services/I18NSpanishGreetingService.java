package hyk.springframework.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Htoo Yanant Khin
 */
//@Service
//@Qualifier
//@Profile({"ES", "default"})
//@Service("i18nService")
public class I18NSpanishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola - ES";
    }
}
