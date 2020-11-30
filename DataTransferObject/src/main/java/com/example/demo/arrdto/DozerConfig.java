package com.example.demo.arrdto;

import org.dozer.CustomConverter;
import org.dozer.loader.api.BeanMappingBuilder;
import org.dozer.loader.api.FieldsMappingOptions;
import org.dozer.loader.api.TypeMappingOptions;
import org.springframework.stereotype.Component;

@Component
public class DozerConfig  extends BeanMappingBuilder implements CustomConverter{ 
	
	@Override
	protected void configure() {
		
		mapping(Source.class, Destination.class, TypeMappingOptions.wildcard(false)) 
		.fields("strings", "strings",FieldsMappingOptions.customConverter(this.getClass())); 
	}

	@Override
	public Object convert(Object existingDestinationFieldValue, Object sourceFieldValue, Class<?> destinationClass,Class<?> sourceClass) {
		if (sourceFieldValue != null && sourceFieldValue instanceof String[] && String[].class.equals(destinationClass)) 
			return (String[])sourceFieldValue;	  
		return null; 
	}
}