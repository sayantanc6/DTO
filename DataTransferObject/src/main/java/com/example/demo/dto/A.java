package com.example.demo.dto;

import java.util.List;

import org.dozer.Mapping;
import org.springframework.stereotype.Component;

@Component
public class A {

	String title;
	List<String> strings;
	
	
	public A() {
	}
	
	@Mapping("title")
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Mapping("strings")
	public List<String> getStrings() {
		return strings;
	}
	public void setStrings(List<String> strings) {
		this.strings = strings;
	}
	
	@Override
	public String toString() {
		return "A [title=" + title + ", strings=" + strings + "]";
	}
}
