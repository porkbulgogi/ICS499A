package com.shew.consulting.eagleeye.msp.quote.service.configuration;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.AnnotationBeanNameGenerator;

public class UniqueNameGenerator extends AnnotationBeanNameGenerator {

    @Override
    public String generateBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
        if (definition.getBeanClassName().contains("model.management")) {
            return definition.getBeanClassName();
        }
        return super.generateBeanName(definition, registry);
    }

}
