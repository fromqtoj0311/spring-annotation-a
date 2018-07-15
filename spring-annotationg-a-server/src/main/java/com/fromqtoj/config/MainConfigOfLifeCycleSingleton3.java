package com.fromqtoj.config;

import com.fromqtoj.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**�ʼǣ�
 * 3��������ʹ��JSR250��
 * 		@PostConstruct����bean������ɲ������Ը�ֵ��ɣ���ִ�г�ʼ������
 * 		@PreDestroy������������bean֮ǰ֪ͨ���ǽ���������
 */

//��������
@Configuration
public class MainConfigOfLifeCycleSingleton3 {
	
	//@Scope("prototype")
	@Bean(initMethod="init",destroyMethod="detory")
	public Car car(){
		return new Car();
	}

}
