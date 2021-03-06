package com.shew.consulting.eagleeye.msp.employee.service.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import javax.validation.Validator;

@Configuration
public class ValidatorConfiguration {

    @Bean
    public Validator validatorFactory() {
        return new LocalValidatorFactoryBean();
    }

}
