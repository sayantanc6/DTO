package com.example.demo.arrdto;

import java.util.Arrays;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ArrCopy {
	
	@Autowired
	DozerBeanMapper mapper;
	
	String strings[] = {"aa","bb","cc"};  
	
	@Autowired
	Source source;
	
	@Autowired
	Destination destination;
	
	

	public ArrCopy() { 
	}

	public  void copy() {
		source.setStrings(strings);
		System.out.println("source strings : "+ Arrays.toString(source.getStrings()));  
		System.out.println("source object : "+source.toString());
		destination = mapper.map(source, Destination.class);
		System.out.println("dest strings : "+Arrays.toString(destination.getStrings())); 
		System.out.println("dest object : "+destination.toString()); 
	}
}
