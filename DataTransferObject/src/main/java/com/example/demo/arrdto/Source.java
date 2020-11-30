package com.example.demo.arrdto;

import java.util.Arrays;

import org.dozer.Mapping;
import org.springframework.stereotype.Component;

@Component
public class Source {
	
	@Mapping("strings") 
	String[] strings; 

	public Source() {
	}

	public String[] getStrings() {
		return strings;
	}

	public void setStrings(String[] strings) {
		this.strings = strings;
	}

	@Override
	public String toString() {
		return "Source [strings=" + Arrays.toString(strings) + "]";
	}
}
