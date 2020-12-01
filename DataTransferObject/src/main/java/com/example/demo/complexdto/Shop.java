package com.example.demo.complexdto;

import org.springframework.stereotype.Component;

@Component
public class Shop {

	String name;
	
	public Shop() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Shop [name=" + name + "]";
	}
}
