package com.simplespringboot;

import com.simplespringboot.runner.SimpleRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author zhangke
 * @date 2018-01-05.
 */
@SpringBootApplication
public class SimpleApplication {
	/**
	 * 容器启动
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SimpleApplication.class,args);
	}

	/**
	 * 定义bean
	 * @return
	 */
	@Bean
	public SimpleRunner simpleRunner(){
		return new SimpleRunner();
	}
}