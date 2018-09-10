package com.stackroute.cvrp.domain;

public class Route {
	private DateLogistics dateLogistics;
	private Order newOrder;
	
	public Route() {
		
	}
	public Route(DateLogistics dataLogistics, Order newOrder) {
		this.dateLogistics = dataLogistics;
		this.newOrder = newOrder;
	}
	public DateLogistics getDataLogistics() {
		return dateLogistics;
	}
	public void setDataLogistics(DateLogistics dataLogistics) {
		this.dateLogistics = dataLogistics;
	}
	public Order getNewOrder() {
		return newOrder;
	}
	public void setNewOrder(Order newOrder) {
		this.newOrder = newOrder;
	}

}
