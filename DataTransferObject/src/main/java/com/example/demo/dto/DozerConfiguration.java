package com.example.demo.dto;
 
import java.util.ArrayList;
import java.util.List;

import org.dozer.CustomConverter;
import org.dozer.loader.api.BeanMappingBuilder;
import org.dozer.loader.api.FieldsMappingOptions;
import org.dozer.loader.api.TypeMappingOptions;
import org.springframework.stereotype.Component;

@Component
public class DozerConfiguration extends BeanMappingBuilder implements CustomConverter{
	
	List<String> strings = new ArrayList<String>();
	List<String> currstrings = new ArrayList<String>();
	  
	@Override
	protected void configure() { 
		mapping(A1.class, A.class, TypeMappingOptions.wildcard(false)) 
		.fields("strings", "strings", FieldsMappingOptions.hintB(String.class), 
				FieldsMappingOptions.customConverter(this.getClass()));
		
//		mapping(A2.class, A.class, TypeMappingOptions.wildcard(false))
//		.fields("strings", "strings", FieldsMappingOptions.hintA(String.class), FieldsMappingOptions.hintB(String.class),
//				FieldsMappingOptions.customConverter(this.getClass())); 
	}
 
	@Override
	public Object convert(Object existingDestinationFieldValue, Object sourceFieldValue, Class<?> destinationClass,Class<?> sourceClass) {
		if (sourceFieldValue != null && sourceFieldValue instanceof List<?> && List.class.equals(destinationClass)) {
		//	currstrings.clear();
			currstrings = (List<String>)sourceFieldValue;
//			for (String string : currstrings) 
//				strings.add(string);
			return currstrings;
		}
		return null;
	}
}