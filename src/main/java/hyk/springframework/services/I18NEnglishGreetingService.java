package hyk.springframework.services;

import hyk.springframework.repositories.EnglishGreetingRepository;

/**
 * @author Htoo Yanant Khin
 */
//@Service
//@Qualifier
//@Profile("EN")
//@Service("i18nService")
public class I18NEnglishGreetingService implements GreetingService{
    private final EnglishGreetingRepository englishGreetingRepository;

    public I18NEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello - EN";
    }
}
