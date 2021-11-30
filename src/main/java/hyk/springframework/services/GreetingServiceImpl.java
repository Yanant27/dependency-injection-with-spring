package hyk.springframework.services;

/**
 * @author Htoo Yanant Khin
 */
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello !";
    }
}
