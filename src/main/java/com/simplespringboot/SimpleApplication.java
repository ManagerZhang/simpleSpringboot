package com.simplespringboot;

import com.simplespringboot.runner.SimpleRunner;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

/**
 * @author zhangke
 * @date 2018-01-05.
 */
@ImportResource("classpath:config/appcontext-dubbo.xml")
@SpringBootApplication
@MapperScan("com.simplespringboot.dao")
public class SimpleApplication {
	/**
	 * 容器启动
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SimpleApplication.class,args);
	}

	/**
	 * 定义测试Runner bean
	 * @return
	 */
	@Bean
	public SimpleRunner simpleRunner(){
		return new SimpleRunner();
	}
}
