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
	A a,b;
	@Autowired
	A1 a1;
	@Autowired
	A2 a2;
	@Autowired
	DozerBeanMapper mapper;
	List<String> strings;
	List<String> tmp;
	
	public MergeTwoObjects() {
	}

	public void merge() {
		System.out.println("inside merge");
		strings = new ArrayList<>();
		
		a1.setTitle("sayantan");
		System.out.println(a1.getTitle());
		a1.setStrings(Arrays.asList("a1","a2","a3"));
		System.out.println(a1.getStrings());
		
		strings.clear();
		a2.setTitle("chatterjee");
		System.out.println(a2.getTitle());
		a2.setStrings(Arrays.asList("a4","a5","a6")); 
		System.out.println(a2.getStrings());
		
		a = mapper.map(a1, A.class);
		System.out.println("after mapping a1 : "+a.getStrings());
		tmp = a.getStrings();
		b = mapper.map(a2, A.class);
		System.out.println("after mapping a2 : "+b.getStrings());
		tmp.addAll(b.getStrings());
		a.setStrings(tmp); 
		
		System.out.println(a.getStrings()); 
	}
}
