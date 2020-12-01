package com.example.demo.complexdto;

import org.springframework.stereotype.Component;

@Component
public class Discount {
     int value;

	public Discount() {
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Discount [value=" + value + "]";
	}
}