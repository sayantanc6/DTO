package com.example.demo.complexdto;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Source {
	
	private String orderFinishDate;
	
    private PaymentType paymentType;
    
    private Discount discount;
    
    private DeliveryData deliveryData;
    
    private User orderingUser;
    
    private List<Product> orderedProducts;
    
    private Shop offeringShop;
    
    private int orderId;
    
    private OrderStatus status;
    
    private LocalDate orderDate;
    
	public Source() {
	}

	public String getOrderFinishDate() {
		return orderFinishDate;
	}

	public void setOrderFinishDate(String orderFinishDate) {
		this.orderFinishDate = orderFinishDate;
	}

	public PaymentType getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public DeliveryData getDeliveryData() {
		return deliveryData;
	}

	public void setDeliveryData(DeliveryData deliveryData) {
		this.deliveryData = deliveryData;
	}

	public User getOrderingUser() {
		return orderingUser;
	}

	public void setOrderingUser(User orderingUser) {
		this.orderingUser = orderingUser;
	}

	public List<Product> getOrderedProducts() {
		return orderedProducts;
	}

	public void setOrderedProducts(List<Product> orderedProducts) {
		this.orderedProducts = orderedProducts;
	}

	public Shop getOfferingShop() {
		return offeringShop;
	}

	public void setOfferingShop(Shop offeringShop) {
		this.offeringShop = offeringShop;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Source [orderFinishDate=" + orderFinishDate + ", paymentType=" + paymentType + ", discount=" + discount
				+ ", deliveryData=" + deliveryData + ", orderingUser=" + orderingUser + ", orderedProducts="
				+ orderedProducts + ", offeringShop=" + offeringShop + ", orderId=" + orderId + ", status=" + status
				+ ", orderDate=" + orderDate + "]";
	}
}
