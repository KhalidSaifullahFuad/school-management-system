package com.cordial.config;

import com.cordial.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.cordial.service"})
public class RootConfig {

    @Bean
    public Student studentDetails() {
        return new Student();
    }

}

