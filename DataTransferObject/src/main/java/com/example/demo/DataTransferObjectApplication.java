package com.example.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.nesteddto.AppConfig3;
import com.example.demo.nesteddto.NestedMapping;

@SpringBootApplication
@ComponentScan("nesteddto.*")
public class DataTransferObjectApplication{
	 
	@Autowired
	static ApplicationContext context;
	
	public static void main(String[] args) {
		SpringApplication.run(DataTransferObjectApplication.class, args);
		context = new AnnotationConfigApplicationContext(AppConfig3.class);  
		try {
//			MergeTwoObjects mObjects = context.getBean(MergeTwoObjects.class);
//			mObjects.merge();
//			ArrCopy  copy = context.getBean(ArrCopy.class);
//			copy.copy();
			NestedMapping  mapping = context.getBean(NestedMapping.class);
			mapping.nestedmap();
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}
}