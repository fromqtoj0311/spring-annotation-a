package com.fromqtoj.config;

import com.fromqtoj.bean.Person;
import com.fromqtoj.service.BookService;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.context.annotation.ComponentScan.Filter;



//������==�����ļ�
@Configuration  //����Spring����һ��������
@ComponentScan(value="com.fromqtoj")
public class MainConfig {

    //��������ע��һ��Bean;����Ϊ����ֵ�����ͣ�idĬ�����÷�������Ϊid
    @Bean("person")
    public Person person01() {
        return new Person("lisi", 20);
    }

}
