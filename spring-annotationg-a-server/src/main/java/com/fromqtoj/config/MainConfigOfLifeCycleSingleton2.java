package com.fromqtoj.config;

import com.fromqtoj.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**笔记：
 * 2）、通过让Bean实现InitializingBean（定义初始化逻辑），
 * 				DisposableBean（定义销毁逻辑）;
 */

//生命周期 cat bean ...
@ComponentScan("com.fromqtoj.bean")
@Configuration
public class MainConfigOfLifeCycleSingleton2 {

	@Bean(initMethod="init",destroyMethod="detory")
	public Car car(){
		return new Car();
	}

}