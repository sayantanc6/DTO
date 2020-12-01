package com.example.demo.complexdto;

import org.springframework.stereotype.Component;

@Component
public class Product {

	String name;
	String id;
	
	public Product() {
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", id=" + id + "]";
	}
}
