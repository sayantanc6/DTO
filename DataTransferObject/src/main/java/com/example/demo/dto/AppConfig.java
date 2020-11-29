package com.example.demo.dto;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
@Configuration
public class AppConfig {
	
	@Bean
	public DozerConfiguration dozer() { 
	    return new DozerConfiguration(); 
	}
	
	@Bean
	public DozerBeanMapper mapper() {
	    return new DozerBeanMapper(); 
	}
	
	@Bean
	public MergeTwoObjects merge() {
		return new MergeTwoObjects();
	}
	
	@Bean
	public A a() {
		return new A();
	}
	
	@Bean
	public A1 a1() {
		return new A1();
	}
	
	@Bean
	public A2 a2() {
		return new A2();
	}

}
