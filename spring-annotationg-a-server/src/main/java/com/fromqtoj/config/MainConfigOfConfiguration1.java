package com.fromqtoj.config;

import com.fromqtoj.bean.Person;
import com.fromqtoj.service.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;


@ComponentScans(
        value = {
                @ComponentScan(value = "com.fromqtoj", includeFilters = {
                        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),
                        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {BookService.class})
                }, useDefaultFilters = false)
        }
)
public class MainConfigOfConfiguration1 {

    //给容器中注册一个Bean;类型为返回值的类型，id默认是用方法名作为id
    @Bean("person")
    public Person person01() {
        return new Person("lisi", 20);
    }
//    mainConfig1
//    bookController
//    bookService
//    person
}