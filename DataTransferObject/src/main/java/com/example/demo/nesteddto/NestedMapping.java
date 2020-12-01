package com.example.demo.nesteddto;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NestedMapping {
	
	@Autowired
	Source source;
	
	@Autowired
	Destination destination;
	
	@Autowired
	AB ab;
	
	@Autowired
	DozerConfig config;
	
	@Autowired
	DozerBeanMapper mapper;
	 
	public void nestedmap() {
		source.setA("a");
		source.setB("b");
		source.setName("nested");
		System.out.println(source.toString()); 
		mapper.addMapping(config); 
		destination = mapper.map(source, Destination.class,"demo"); 
		System.out.println(destination.toString());
		System.out.println(destination.getAb().toString());  
	}
}
