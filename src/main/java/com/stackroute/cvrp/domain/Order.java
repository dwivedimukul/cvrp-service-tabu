package com.stackroute.cvrp.domain;

import javax.persistence.Entity;

@Entity
public class Order {

	private String orderId;
	private String orderConsumerName;
	private String orderConsumerAddress;
	private String orderConsumerPhone;
	private Location orderLocation;
	private String orderVolume;
	private String orderDate;
	private boolean isRouted;
	private Slots availableSlots;
	private String selectedSlot;
	
	

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderConsumerName() {
		return orderConsumerName;
	}

	public void setOrderConsumerName(String orderConsumerName) {
		this.orderConsumerName = orderConsumerName;
	}

	public String getOrderConsumerAddress() {
		return orderConsumerAddress;
	}

	public void setOrderConsumerAddress(String orderConsumerAddress) {
		this.orderConsumerAddress = orderConsumerAddress;
	}

	public String getOrderConsumerPhone() {
		return orderConsumerPhone;
	}

	public void setOrderConsumerPhone(String orderConsumerPhone) {
		this.orderConsumerPhone = orderConsumerPhone;
	}

	public Location getOrderLocation() {
		return orderLocation;
	}

	public void setOrderLocation(Location orderLocation) {
		this.orderLocation = orderLocation;
	}

	public String getOrderVolume() {
		return orderVolume;
	}

	public void setOrderVolume(String orderVolume) {
		this.orderVolume = orderVolume;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public boolean isRouted() {
		return isRouted;
	}

	public void setRouted(boolean isRouted) {
		this.isRouted = isRouted;
	}

	public Slots getAvailableSlots() {
		return availableSlots;
	}

	public void setAvailableSlots(Slots availableSlots) {
		this.availableSlots = availableSlots;
	}

	public String getSelectedSlots() {
		return selectedSlot;
	}

	public void setSelectedSlots(String selectedSlots) {
		this.selectedSlot = selectedSlots;
	}

	public Order(String orderId, String orderConsumerName, String orderConsumerAddress, String orderConsumerPhone,
			Location orderLocation, String orderVolume, String orderDate, boolean isRouted, Slots availableSlots,
			String selectedSlots) {
		super();
		this.orderId = orderId;
		this.orderConsumerName = orderConsumerName;
		this.orderConsumerAddress = orderConsumerAddress;
		this.orderConsumerPhone = orderConsumerPhone;
		this.orderLocation = orderLocation;
		this.orderVolume = orderVolume;
		this.orderDate = orderDate;
		this.isRouted = isRouted;
		this.availableSlots = availableSlots;
		this.selectedSlot = selectedSlots;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderConsumerName=" + orderConsumerName + ", orderConsumerAddress="
				+ orderConsumerAddress + ", orderConsumerPhone=" + orderConsumerPhone + ", orderLocation="
				+ orderLocation + ", orderVolume=" + orderVolume + ", orderDate=" + orderDate + ", isRouted=" + isRouted
				+ ", availableSlots=" + availableSlots + ", selectedSlot=" + selectedSlot + "]";
	}

	public Order() {
		//super();
		// TODO Auto-generated constructor stub
	}

}
