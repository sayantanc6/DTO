package com.example.demo.nesteddto;

import org.springframework.stereotype.Component;

@Component
public class Destination {

	AB ab;
	
	String name;

	public Destination() {
	}

	public AB getAb() {
		return ab;
	}

	public void setAb(AB ab) {
		this.ab = ab;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Destination [ab=" + ab + ", name=" + name + "]";
	}
}
