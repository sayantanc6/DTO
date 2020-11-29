package com.example.demo.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MergeTwoObjects {
	
	@Autowired
	A a;
	@Autowired 
	A1 a1;
	@Autowired
	A2 a2;
	@Autowired
	DozerBeanMapper mapper;
	List<String> stringsarr;
	List<String> tmp;
	
	public MergeTwoObjects() {
	}

	public void merge() {
		System.out.println("inside merge");
		stringsarr = new ArrayList<>(); 
		
		a1.setTitle("sayantan");
		System.out.println(a1.getTitle());
		a1.setStrings(Arrays.asList("a1","a2","a3"));
		System.out.println(a1.getStrings());
		
		a2.setTitle("chatterjee");
		System.out.println(a2.getTitle());
		a2.setStrings(Arrays.asList("a4","a5","a6"));
		System.out.println(a2.getStrings());
		
		mapper.map(a1, a);
		mapper.map(a2, a); 
		System.out.println(a.getTitle()); 
		System.out.println(a.getStrings());  
	}
}
