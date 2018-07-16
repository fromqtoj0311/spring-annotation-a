package com.fromqtoj.test;

import com.fromqtoj.bean.Blue;
import com.fromqtoj.bean.Color;
import com.fromqtoj.bean.Person;
import com.fromqtoj.bean.RainBow;
import com.fromqtoj.config.MainConfigOfImport;
import com.fromqtoj.config.MainConfigOfImportBeanDefinitionRegistrar;
import com.fromqtoj.config.MainConfigOfImportCondition;
import com.fromqtoj.config.MainConfigOfImportSelector;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

//
public class IOCTest_Import {
  /**
   * 功能描述:
   *
   * @param: Import使用 Color bean
   * @auther: qijian3
   * @date: 2018/7/16 12:39
   */
  @SuppressWarnings("resource")
  @Test
  public void testImport() {
    AnnotationConfigApplicationContext applicationContext =
        new AnnotationConfigApplicationContext(MainConfigOfImport.class);
    String[] definitionNames = applicationContext.getBeanDefinitionNames();
    for (String name : definitionNames) {
      System.out.println("definitionNames:---"+name);
    }
    Color bean = applicationContext.getBean(Color.class);
    System.out.println("Color:---"+bean);
  }
  /**
   * 功能描述:
   *
   * @param: ImportSelector 使用  beans : Color   MyImportSelector- >Blue Yellow
   * @auther: qijian3
   * @date: 2018/7/16 12:38
   */
  @SuppressWarnings("resource")
  @Test
  public void testImportSelector() {
    AnnotationConfigApplicationContext applicationContext =
        new AnnotationConfigApplicationContext(MainConfigOfImportSelector.class);
    String[] definitionNames = applicationContext.getBeanDefinitionNames();
    for (String name : definitionNames) {
      System.out.println("definitionNames:---"+name);
    }

    Blue bean = applicationContext.getBean(Blue.class);
    System.out.println("Blue:---"+bean);
  }
  /**
   * 功能描述:
   *
   * @param: Condition 根据操作系统是 window 还是 linux 判断获取哪个bean;（使用window000和linux000--》Person Bean）
   * @auther: qijian3
   * @date: 2018/7/16 15:41
   */
  @SuppressWarnings("resource")
  @Test
  public void testImportCondition() {
    AnnotationConfigApplicationContext applicationContext =
        new AnnotationConfigApplicationContext(MainConfigOfImportCondition.class);
    String[] namesForType = applicationContext.getBeanNamesForType(Person.class);
    ConfigurableEnvironment environment = applicationContext.getEnvironment();
    String property = environment.getProperty("os.name");
    System.out.println("property:---"+property);
    for (String name : namesForType) {
      System.out.println("namesForType:---"+name);
    }

    Map<String, Person> persons = applicationContext.getBeansOfType(Person.class);
    System.out.println("persons:---"+persons);
  }

  /**
   * 功能描述:
   *
   * @param: ImportBeanDefinitionRegistrar 注入 （使用RainBow Bean）
   * @auther: qijian3
   * @date: 2018/7/16 15:40
   */
  @SuppressWarnings("resource")
  @Test
  public void testImportBeanDefinitionRegistrar() {
    AnnotationConfigApplicationContext applicationContext =
        new AnnotationConfigApplicationContext(MainConfigOfImportBeanDefinitionRegistrar.class);

    String[] definitionNames = applicationContext.getBeanDefinitionNames();
    for (String name : definitionNames) {
      System.out.println("1:---"+name);
    }
    RainBow bean = applicationContext.getBean(RainBow.class);
    System.out.println("2:---" + bean);
  }
}
