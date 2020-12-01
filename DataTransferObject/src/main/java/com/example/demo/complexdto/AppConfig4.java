package com.example.demo.complexdto;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig4 {

	@Bean
	public Source source() {
		return new Source();
	}
	
	@Bean
	public Discount discount() {
		return new Discount();		 
	}
	
	@Bean
	public User user() {
		return new User();
	}
	
	@Bean
	public DeliveryData data() {
		return new DeliveryData();
	}
	
	@Bean
	public Shop shop() {
		return new Shop();
	}
	
	@Bean
	public Product product( ) {
		return new Product();
	}
	
	@Bean
	public DozerBeanMapper mapper() {
		return new DozerBeanMapper();
	}
}
