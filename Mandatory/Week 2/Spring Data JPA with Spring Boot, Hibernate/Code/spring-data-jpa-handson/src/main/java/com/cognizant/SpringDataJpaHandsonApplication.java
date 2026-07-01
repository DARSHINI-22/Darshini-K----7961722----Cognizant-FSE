package com.cognizant;

import com.cognizant.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpaHandsonApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaHandsonApplication.class, args);
    }

    @Override
    public void run(String... args) {

        System.out.println("Countries");

        countryService.getAllCountries()
                .forEach(System.out::println);

    }
}
