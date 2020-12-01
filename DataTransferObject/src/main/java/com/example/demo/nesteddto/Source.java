package com.example.demo.nesteddto;

import org.dozer.Mapping;
import org.springframework.stereotype.Component;

@Component
public class Source {

	@Mapping("dest.a")
	String a;
	
	@Mapping("dest.b")
	String b;
	
	@Mapping("name")
	String name;

	public Source() {
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



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Source [a=" + a + ", b=" + b + ", name=" + name + "]";
	}
}
