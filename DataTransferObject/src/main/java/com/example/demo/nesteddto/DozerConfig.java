package com.example.demo.nesteddto;

import org.dozer.loader.api.BeanMappingBuilder;
import org.dozer.loader.api.FieldsMappingOptions;
import org.dozer.loader.api.TypeMappingOptions;
import org.springframework.stereotype.Component;

@Component
public class DozerConfig extends BeanMappingBuilder {

	@Override
	protected void configure() {
		
		mapping(Source.class, Destination.class, TypeMappingOptions.wildcard(false),TypeMappingOptions.mapId("demo"))
		.fields("name", "name")
		.fields("a", "ab.a")
		.fields("b", "ab.b"); 
	}

}
