package hyk.springframework.services;

import org.springframework.stereotype.Service;

/**
 * @author Htoo Yanant Khin
 */
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello !";
    }
}
