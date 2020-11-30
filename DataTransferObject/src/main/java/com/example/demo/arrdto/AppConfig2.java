package com.example.demo.arrdto;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {
	
	@Bean
	public Source src() {
		return new Source();
	}
	@Bean
	public ArrCopy arr() {
		return new ArrCopy();
	}
	
	@Bean
	public Destination dest() {
		return new Destination();
	}
	@Bean
	public DozerConfig conf() {
		return new DozerConfig();
	}
	
	@Bean
	public DozerBeanMapper mapper() {
		return new DozerBeanMapper();
	}
}
