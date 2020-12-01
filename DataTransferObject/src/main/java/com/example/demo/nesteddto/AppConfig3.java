package com.example.demo.nesteddto;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig3 {
	
	@Bean
	public NestedMapping map() {
		return new NestedMapping();
	} 

	@Bean
	public Source src() {
		return new Source();
	}
	
	@Bean
	public Destination dest() {
		return new Destination();
	}
	
	@Bean
	public AB ab() {
		return new AB();
	}
	
	@Bean
	public DozerBeanMapper mapper() {
		return new DozerBeanMapper();
	}
	
	@Bean
	public DozerConfig conf() {
		return new DozerConfig();
	}
}
