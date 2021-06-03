package com.alexcorp.example.hibernateinterceptor;

import com.alexcorp.example.hibernateinterceptor.domain.Watch;
import com.alexcorp.example.hibernateinterceptor.repository.WatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernateInterceptorApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernateInterceptorApplication.class, args);
    }

    @Autowired
    WatchRepository repository;

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            Watch watch = new Watch();
            watch.setId(1L);
            watch.setName("Rado");
            watch.setYear(2020);

            repository.save(watch);
        };
    }
}
