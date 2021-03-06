package hyk.springframework.config;

import hyk.springframework.datasource.DataSource;
import hyk.springframework.repositories.EnglishGreetingRepository;
import hyk.springframework.repositories.EnglishGreetingRepositoryImpl;
import hyk.springframework.services.*;
import org.springframework.context.annotation.*;

/**
 * @author Htoo Yanant Khin
 */
@ImportResource("classpath:diwithspring-config.xml")
@Configuration
public class GreetingServiceConfig {

    @Profile({"ES", "default"})
    @Bean("i18nService")
    I18NSpanishGreetingService i18NSpanishGreetingService() {
        return new I18NSpanishGreetingService();
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository() {
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile("EN")
    @Bean("i18nService")
    I18NEnglishGreetingService i18NEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        return new I18NEnglishGreetingService(englishGreetingRepository);
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }

    @Bean
    SetterGreetingService setterGreetingService() {
        return new SetterGreetingService();
    }

    @Bean
    PropertyGreetingService propertyGreetingService() {
        return new PropertyGreetingService();
    }

    @Bean
    DataSource dataSource(AppConfig appConfig) {
        DataSource dataSource = new DataSource();
        dataSource.setUsername(appConfig.getUsername());
        dataSource.setPassword(appConfig.getPassword());
        dataSource.setJdbcurl(appConfig.getJdbcurl());
        return dataSource;
    }
}