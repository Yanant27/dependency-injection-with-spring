package hyk.springframework.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Htoo Yanant Khin
 */
//@Service
//@Qualifier
@Profile("EN")
@Service("i18nService")
public class I18NEnglishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello - EN";
    }
}
