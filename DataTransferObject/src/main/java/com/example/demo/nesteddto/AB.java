package com.example.demo.nesteddto;

import org.springframework.stereotype.Component;

@Component
public class AB {

	String a;
	
	String b;

	public AB() {
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "AB [a=" + a + ", b=" + b + "]";
	}
}
