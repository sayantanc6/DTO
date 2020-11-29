package com.example.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.dto.AppConfig;
import com.example.demo.dto.MergeTwoObjects;

@SpringBootApplication
public class DataTransferObjectApplication{
	 
	@Autowired
	static ApplicationContext context;
	
	public static void main(String[] args) {
		SpringApplication.run(DataTransferObjectApplication.class, args);
		context = new AnnotationConfigApplicationContext(AppConfig.class); 
		try {
			MergeTwoObjects mObjects = context.getBean(MergeTwoObjects.class);
			mObjects.merge();
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}
}