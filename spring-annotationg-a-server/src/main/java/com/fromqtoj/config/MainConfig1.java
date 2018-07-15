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
public class MainConfig1 {

    //��������ע��һ��Bean;����Ϊ����ֵ�����ͣ�idĬ�����÷�������Ϊid
    @Bean("person")
    public Person person01() {
        return new Person("lisi", 20);
    }
//    mainConfig1
//    bookController
//    bookService
//    person
}
