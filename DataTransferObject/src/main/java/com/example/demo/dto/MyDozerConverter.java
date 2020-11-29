package com.example.demo.dto;

import java.util.List;

import org.dozer.DozerConverter;
import org.springframework.stereotype.Component;

@Component
public class MyDozerConverter extends DozerConverter<List<String>, List<String>> {
	
	List<String>  currStrings;
	 
	public MyDozerConverter() {
		super((Class<List<String>>)(Class<?>)List.class, (Class<List<String>>)(Class<?>)List.class);
	} 

	@Override
	public List<String> convertTo(List<String> source, List<String> destination) {
		return null;
	} 

	@Override
	public List<String> convertFrom(List<String> source, List<String> destination) {
		return source;
	}
}
