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
        //1、创建ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycleSingleton.class);
        System.out.println("容器创建完成...");
        //关闭容器
        applicationContext.close();

//		car constructor...
//		car ... init...
//		容器创建完成...
//		car ... detory...
    }

    @Test
    public void LiftCyclePrototype() {
        //1、创建ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCyclePrototype.class);
        System.out.println("容器创建完成...");

        applicationContext.getBean("car");
        //关闭容器
        applicationContext.close();
        //		容器创建完成...
        //		car constructor...
//		car ... init...

    }

    @Test
    public void LiftCycleSingletonCat() {
        //1、创建ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycleSingleton2.class);
        System.out.println("容器创建完成...");
        //关闭容器
        applicationContext.close();

//        car constructor...
//        car ... init...
//        cat constructor...
//        cat...afterPropertiesSet...（初始化方法）
//        容器创建完成...
//        cat...destroy...
//        car ... detory...
    }

    @Test
    public void LiftCycleSingletonBeanPostProcessor() {
        //1、创建ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycleSingleton4.class);
        System.out.println("容器创建完成...");
        //关闭容器
        applicationContext.close();
    }
    @Test
    public void LiftCycleSingletonDog() {
        //1、创建ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycleSingleton3.class);
        System.out.println("容器创建完成...");
        //关闭容器
        applicationContext.close();
    }
}
