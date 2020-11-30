package com.example.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.example.demo.arrdto.AppConfig2;
import com.example.demo.arrdto.ArrCopy;
import com.example.demo.dto.AppConfig;
import com.example.demo.dto.MergeTwoObjects;

@SpringBootApplication
@ComponentScan
public class DataTransferObjectApplication{
	 
	@Autowired
	static ApplicationContext context;
	
	public static void main(String[] args) {
		SpringApplication.run(DataTransferObjectApplication.class, args);
		context = new AnnotationConfigApplicationContext(AppConfig2.class); 
		try {
//			MergeTwoObjects mObjects = context.getBean(MergeTwoObjects.class);
//			mObjects.merge();
			ArrCopy  copy = context.getBean(ArrCopy.class);
			copy.copy();
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}
}