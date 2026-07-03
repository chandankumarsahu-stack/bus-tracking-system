package com.example.bus_tracking.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.bus_tracking.entity.Role;
import com.example.bus_tracking.entity.User;
import com.example.bus_tracking.repository.UserRepository;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadUsers(UserRepository repository,
                                PasswordEncoder encoder) {

        return args -> {

            if (repository.count() == 0) {

                User admin = new User();
                admin.setFullName("System Admin");
                admin.setEmail("admin@gmail.com");
                admin.setPassword(encoder.encode("admin123"));
                admin.setRole(Role.ADMIN);
                repository.save(admin);

                User driver = new User();
                driver.setFullName("Bus Driver");
                driver.setEmail("driver@gmail.com");
                driver.setPassword(encoder.encode("driver123"));
                driver.setRole(Role.DRIVER);
                repository.save(driver);

                User parent = new User();
                parent.setFullName("Parent User");
                parent.setEmail("parent@gmail.com");
                parent.setPassword(encoder.encode("parent123"));
                parent.setRole(Role.PARENT);
                repository.save(parent);

                System.out.println("Default users created.");
            }
        };
    }
}