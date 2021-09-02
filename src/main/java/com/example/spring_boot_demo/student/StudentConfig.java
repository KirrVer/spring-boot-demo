package com.example.spring_boot_demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository studentRepository){
        return args -> {
            Student wasia = new Student("Wasia",
                    LocalDate.of(2000, Month.AUGUST,
                            5),"wasia.jmpal@gmail.com");

            Student tania = new Student("Tania",
                    LocalDate.of(2003, Month.AUGUST,
                            6),"tania@gmail.com");

            studentRepository.saveAll(List.of(wasia, tania));
        };

    }
}
