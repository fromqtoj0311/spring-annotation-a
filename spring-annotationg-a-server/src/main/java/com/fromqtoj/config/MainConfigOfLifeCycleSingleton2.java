package com.fromqtoj.config;

import com.fromqtoj.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**�ʼǣ�

 * 2����ͨ����Beanʵ��InitializingBean�������ʼ���߼�����
 * 				DisposableBean�����������߼���;
 */

//�������� cat bean ...
@ComponentScan("com.fromqtoj.bean")
@Configuration
public class MainConfigOfLifeCycleSingleton2 {
	
	@Bean(initMethod="init",destroyMethod="detory")
	public Car car(){
		return new Car();
	}

}
