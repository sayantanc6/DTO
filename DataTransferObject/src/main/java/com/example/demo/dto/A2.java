package com.example.demo.dto;

import java.util.List;

import org.dozer.Mapping;
import org.springframework.stereotype.Component;

@Component
public class A2 {

	String title;
	
	@Mapping("strings")
	List<String> strings;
	
	public A2() {
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public List<String> getStrings() {
		return strings;
	}
	public void setStrings(List<String> strings) {
		this.strings = strings;
	}
	@Override
	public String toString() {
		return "A2 [title=" + title + ", strings=" + strings + "]";
	}
}
