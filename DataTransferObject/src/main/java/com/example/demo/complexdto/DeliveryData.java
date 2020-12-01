package com.example.demo.complexdto;

import org.springframework.stereotype.Component;

@Component
public class DeliveryData {
	String data;
	
	public DeliveryData() {
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "DeliveryData [data=" + data + "]";
	}
}
