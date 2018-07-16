package com.fromqtoj.config;

import com.fromqtoj.bean.Color;
import com.fromqtoj.bean.Person;
import com.fromqtoj.condition.MyImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;


@Configuration
@Import({MyImportBeanDefinitionRegistrar.class})
public class MainConfigOfImportBeanDefinitionRegistrar {

  @Lazy
  @Bean("person")
  public Person person() {
    System.out.println("给容器中添加Person....");
    return new Person("张三", 25);
  }
}
