package com.example.demo.arrdto;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class Destination {

	String[] strings;

	public Destination() {
	}

	public String[] getStrings() {
		return strings;
	}

	public void setStrings(String[] strings) {
		this.strings = strings;
	}

	@Override
	public String toString() {
		return "Destination [strings=" + Arrays.toString(strings) + "]";
	} 
}
