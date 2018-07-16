package com.fromqtoj.config;

import com.fromqtoj.bean.Person;
import com.fromqtoj.service.BookService;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.context.annotation.ComponentScan.Filter;



//配置类==配置文件
@Configuration  //告诉Spring这是一个配置类
@ComponentScan(value="com.fromqtoj")
public class MainConfigOfConfiguration {

  //给容器中注册一个Bean;类型为返回值的类型，id默认是用方法名作为id
  @Bean("person")
  public Person person01() {
    return new Person("lisi", 20);
  }

}