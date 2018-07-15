package com.fromqtoj.test;

import com.fromqtoj.config.MainConfigOfLifeCyclePrototype;
import com.fromqtoj.config.MainConfigOfLifeCycleSingleton;
import com.fromqtoj.config.MainConfigOfLifeCycleSingleton2;
import com.fromqtoj.config.MainConfigOfLifeCycleSingleton3;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_LifeCycle {

    @Test
    public void LiftCycleSingleton() {
        //1������ioc����
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycleSingleton.class);
        System.out.println("�����������...");
        //�ر�����
        applicationContext.close();

//		car constructor...
//		car ... init...
//		�����������...
//		car ... detory...
    }

    @Test
    public void LiftCyclePrototype() {
        //1������ioc����
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCyclePrototype.class);
        System.out.println("�����������...");

        applicationContext.getBean("car");
        //�ر�����
        applicationContext.close();
        //		�����������...
        //		car constructor...
//		car ... init...

    }

    @Test
    public void LiftCycleSingletonCat() {
        //1������ioc����
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycleSingleton2.class);
        System.out.println("�����������...");
        //�ر�����
        applicationContext.close();

//        car constructor...
//        car ... init...
//        cat constructor...
//        cat...afterPropertiesSet...����ʼ��������
//        �����������...
//        cat...destroy...
//        car ... detory...
    }

    @Test
    public void LiftCycleSingletonBeanPostProcessor() {
        //1������ioc����
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycleSingleton4.class);
        System.out.println("�����������...");
        //�ر�����
        applicationContext.close();
    }
    @Test
    public void LiftCycleSingletonDog() {
        //1������ioc����
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycleSingleton3.class);
        System.out.println("�����������...");
        //�ر�����
        applicationContext.close();
    }
}
