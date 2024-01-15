package com.proiect.ervinpiscoran;

import com.proiect.ervinpiscoran.models.User;
import com.proiect.ervinpiscoran.models.UserStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(UserRepository repository) {

        return args -> {
            log.info("Preloading: " + repository.save(new User("Mihaita", "mihaieminescu@hotmail.com", 10, UserStatus.INACTIVE,true, 37)));
            log.info("Preloading: " +repository.save(new User("Ionut", "ioncreanga@yahoo.com", 0, UserStatus.ACTIVE, false, 21)));
            log.info("Preloading: " +repository.save(new User("Bacovia", "tristete@gmail.com", 0, UserStatus.ACTIVE, true, 29)));
        };
    }
}