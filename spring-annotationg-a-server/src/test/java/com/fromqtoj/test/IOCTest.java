package com.fromqtoj.test;

import com.fromqtoj.config.MainConfigOfConfiguration;
import com.fromqtoj.config.MainConfigOfConfiguration1;
import com.fromqtoj.config.MainConfigOfConfiguration2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest {


    @SuppressWarnings("resource")
    @Test
    public void testMainConfig() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfConfiguration.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }
    @SuppressWarnings("resource")
    @Test
    public void testMainConfig1() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfConfiguration1.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }

    @SuppressWarnings("resource")
    @Test
    public void testMainConfig2() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfConfiguration2.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }

}
